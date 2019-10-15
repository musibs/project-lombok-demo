package io.codefountain.project.lombok.sneakythrow;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SneakyThrowExample {

    @SneakyThrows(IOException.class)
    public String read(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader((new File("abc.txt"))));
            return new String("Mock Data");
        }
        catch (IOException io){
            throw io;
        }

    }
}
