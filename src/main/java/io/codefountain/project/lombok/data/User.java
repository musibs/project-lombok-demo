package io.codefountain.project.lombok.data;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private final String userId;
    private final char[] password;
    private Date lastLogin;

}
