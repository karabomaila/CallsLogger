package org.logger.callslogger.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Signup {
    private String username;
    private String phoneNumber;
    private String password;
    private String email;
}
