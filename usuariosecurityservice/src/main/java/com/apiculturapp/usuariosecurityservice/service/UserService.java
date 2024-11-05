package com.apiculturapp.usuariosecurityservice.service;

import com.apiculturapp.usuariosecurityservice.entity.User;

public interface UserService {

    User createUser(User user);

    User findById(Long id);

    User login(String email, String password);

    User deleteUser(Long id);
}
