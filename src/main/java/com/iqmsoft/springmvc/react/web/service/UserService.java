package com.iqmsoft.springmvc.react.web.service;

import java.util.List;

import com.iqmsoft.springmvc.react.web.entity.User;

public interface UserService {
    User addUser(User user);
    void delete(long id);
    User getByUsername(String name);
    User getById(Long id);
    User editUser(User user);
    List<User> getAll();
    boolean isUserExist(User user);
}