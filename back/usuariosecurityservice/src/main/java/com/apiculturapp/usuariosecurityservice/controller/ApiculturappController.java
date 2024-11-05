package com.apiculturapp.usuariosecurityservice.controller;


import com.apiculturapp.usuariosecurityservice.entity.User;
import com.apiculturapp.usuariosecurityservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
@EnableMethodSecurity
@CrossOrigin(origins = "http://localhost:8080/login")
public class ApiculturappController {

    private final UserService userService;

    @GetMapping("/extracciones")
    public String extracciones(){
        return "extracciones";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String admin(){
        return "admin";
    }
}
