package com.fitnesstracker.dao;


import com.fitnesstracker.model.User;

public interface UserDAO {
    User findByUsername(String username);
    User save(User user);
}
