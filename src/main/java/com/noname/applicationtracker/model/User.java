package com.noname.applicationtracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter
    @Getter
    @Column(name = "EmailAddress",unique = true,nullable = false)
    private String emailAddress;

    @Setter
    @Getter
    @Column(name = "FirstName",nullable = false)
    private String firstName;

    @Setter
    @Getter
    @Column(name = "LastName",nullable = false)
    private String lastName;

    @Setter
    @Getter
    @Column(name = "Password",nullable = false)
    private String password;

    public User() {
    }

    public User(String emailAddress, String firstName, String lastName, String password) {

        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public User(String emailAddress, String password) {

        this.emailAddress = emailAddress;
        this.password = password;
    }

}
