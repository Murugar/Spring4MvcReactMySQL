package com.iqmsoft.springmvc.react.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.springmvc.react.web.entity.User;
import com.iqmsoft.springmvc.react.web.repository.UserRepository;
import com.iqmsoft.springmvc.react.web.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User tag) {
        User savedBank = userRepository.saveAndFlush(tag);

        return savedBank;
    }

    @Override
    public void delete(long id) {
        userRepository.delete(id);
    }

    @Override
    public User getByUsername(String name) {
        return userRepository.findByUsername(name);
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User editUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean isUserExist(User user) { return getByUsername(user.getUsername()) != null; };
}
