package com.noname.applicationtracker.service;


import com.noname.applicationtracker.dto.UserDTO;
import com.noname.applicationtracker.model.User;
import com.noname.applicationtracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<String> registerUser(UserDTO userDTO) throws Throwable{
        User newUser = new User();
        User existingUser = userRepository.findByEmailAddress(userDTO.getEmailAddress());
        if(existingUser!=null){
            return new ResponseEntity<>("User already exists!",HttpStatus.BAD_REQUEST);
        }
        if(userDTO==null){
            throw new IllegalArgumentException("User Details are Required");
        }
        if (userDTO.getEmailAddress() == null) {
            throw new IllegalArgumentException("Email Address not provided...");
        } else {
            newUser.setEmailAddress(userDTO.getEmailAddress());
        }
        if(userDTO.getFirstName()!=null){
            newUser.setFirstName(userDTO.getFirstName());
        }else{
            throw new IllegalArgumentException("FirstName not provided..");
        }
        if(userDTO.getLastName()!=null){
            newUser.setLastName(userDTO.getLastName());
        }else{
            throw new IllegalArgumentException("Last Name not provided...");
        }
        if (userDTO.getPassword()!=null){
            newUser.setPassword(userDTO.getPassword());
        }else{
            throw new IllegalArgumentException("Password field is empty...");
        }

        userRepository.save(newUser);
        return new ResponseEntity<>("User Registered Successfully!!", HttpStatus.CREATED);
        //TODO: Implement password encryption for user registration.
    }
}
