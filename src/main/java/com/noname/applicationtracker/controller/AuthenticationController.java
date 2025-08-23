package com.noname.applicationtracker.controller;

import com.noname.applicationtracker.dto.UserDTO;
import com.noname.applicationtracker.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/auth/user/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDTO userDTO) throws Throwable {
        return authenticationService.registerUser(userDTO);
    }
}
