package com.example.yichun.controller;


import com.example.yichun.DAO.UserRepository;
import com.example.yichun.model.User;
import com.example.yichun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    //find
    @GetMapping("/findUserByUserName")
    public User findUserByUserName(String userName) {
        return userService.findUserByUserName(userName);
    }

    @GetMapping("/findUserById")
    public User findUserById (int id) {
        return userService.findUserById(id);
    }

    @GetMapping("/findAllUsers")
    public List<User> findAllUsers() {
        List<User> users = userRepository.findAll();
        System.out.println("in find all users!");
        return users;
    }

    //delete
    @Transactional
    @DeleteMapping("/deleteUserByUserName/{userName}")
    public ResponseEntity<?> deleteUserByUserName(@PathVariable(value = "userName") String userName) {
        //UserDetail user = userDetailService.findByUserId(userId)
        //.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

        userService.deleteUserByUserName(userName);

        return ResponseEntity.ok().build();
    }

    @Transactional
    @DeleteMapping("/deleteUserById/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable(value = "id") int userId) {
        //UserDetail user = userDetailService.findByUserId(userId)
        //.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

        userService.deleteUserById(userId);

        return ResponseEntity.ok().build();
    }

    //add user
    @PostMapping(value = "/addUser", consumes = "application/json")
    public User saveUser(
            @RequestParam("userName") String username,
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ) {
        User user =  new User(username,email, password);
        return userService.saveUser(user);
    }


    @PutMapping("/updateUserById/{id}")
    public User updateUserById(@PathVariable(value = "id") int userId,
                               User userDetails) {

        User user = userService.findUserById(userId);
        //.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

        user.setUserName(userDetails.getUserName());
        user.setPassword(userDetails.getPassword());
        user.setEmail(userDetails.getEmail());
        //user.setRole(userDetails.getRole());

        User updatedUser = userService.saveUser(user);
        return updatedUser;
    }
}
