package io.codefountain.project.lombok.data;

import java.util.Date;

public class UserMain {

    public static void main(String[] args) {
        User john = new User("john", "password".toCharArray());

        john.setLastLogin(new Date());

        System.out.println(john.toString());
        System.out.println(john.getUserId());
    }
}
