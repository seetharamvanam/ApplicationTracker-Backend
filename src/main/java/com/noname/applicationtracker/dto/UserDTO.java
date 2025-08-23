package com.noname.applicationtracker.dto;


import lombok.Getter;
import lombok.Setter;

public class UserDTO {
    private String emailAddress;
    private String password;
    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    public UserDTO(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
