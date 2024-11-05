package com.apiculturapp.usuariosecurityservice.service;

import com.apiculturapp.usuariosecurityservice.entity.User;
import com.apiculturapp.usuariosecurityservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    @Override
    public User login(String email, String password) {
        User userdetails = userRepository.findByEmail(email);
        boolean isPasswordMatch = passwordEncoder.matches(password, userdetails.getPassword());
        if (isPasswordMatch) {
            return userdetails;
        }
        return null;
    }

    @Override
    public User deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        userRepository.delete(user);
        return user;
    }
}
