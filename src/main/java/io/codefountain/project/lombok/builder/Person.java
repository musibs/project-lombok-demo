package io.codefountain.project.lombok.builder;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

@Builder
@ToString   
public class Person {

    @NonNull
    private String ssnNo;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;

    private String[] hobbies;
    private String contactNo;
    private String emailId;
    private String profession;

}
