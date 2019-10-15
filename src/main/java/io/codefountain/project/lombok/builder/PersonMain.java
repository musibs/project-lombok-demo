package io.codefountain.project.lombok.builder;

public class PersonMain {

    public static void main(String[] args) {

        Person person = Person.builder().ssnNo("S123").firstName("John").lastName("Doe").build();
        System.out.println(person);
    }
}
