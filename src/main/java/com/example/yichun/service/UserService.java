package com.example.yichun.service;

import com.example.yichun.model.User;

import java.util.List;

public interface UserService {
    //find
    User findUserByUserName(String userName);
    User findUserById(int id);
    List<User> findAllUsers();
    //delete
    void deleteUserByUserName(String userName);
    void deleteUserById(int id);
    //add
    User saveUser(User user);
    //update
    User updateUser(User user);
}
