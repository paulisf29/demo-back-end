package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UserLoginDTO;
import com.example.demo.Entities.User;
import com.example.demo.Repositories.UserRepository;

@RestController
@RequestMapping("/api/users")

public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody UserLoginDTO userLoginDTO){

       User user = userRepository.findByEmailAndPassword(userLoginDTO.getEmail(), userLoginDTO.getPassword());

       if (user == null) {
        System.out.println("no existe");
       } else{
        System.out.println("existe");
       }
        return "";
    }
    
}
