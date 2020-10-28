package com.example.yichun.service.impl;

import com.example.yichun.DAO.UserRepository;
import com.example.yichun.model.User;
import com.example.yichun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;
    //find
    @Override
    public User findUserByUserName(String userName) {
        return userRepository.findUserByUserName(userName);
    }

    @Override
    public User findUserById(int id) {
        return userRepository.findUserById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    //delete
    @Override
    public void deleteUserByUserName(String userName){
        userRepository.deleteUserByUserName(userName);
    }

    @Override
    public void deleteUserById(int id){
        userRepository.deleteUserById(id);
    }

    //add
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    //update
    public User updateUser(User user){
        return userRepository.save(user);
    }
}
