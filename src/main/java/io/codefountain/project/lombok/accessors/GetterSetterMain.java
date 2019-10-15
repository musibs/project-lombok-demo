package io.codefountain.project.lombok.accessors;

public class GetterSetterMain {

    public static void main(String[] args) {

        Person john = new Person();
        john.setFirstName("John");
        john.setLastName("Doe");

        System.out.println(john.getFirstName());
        System.out.println(john.getLastName());
    }
}
