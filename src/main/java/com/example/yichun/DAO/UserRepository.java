package com.example.yichun.DAO;

import com.example.yichun.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUserName(String userName);
    User findUserById(int id);

    @Transactional
    void deleteUserById(int id);

    @Transactional
    void deleteUserByUserName(String userName);

    boolean existsByUserName(String username);

    boolean existsByEmail(String email);

    List<User> findAll();

    void deleteAll();

}
