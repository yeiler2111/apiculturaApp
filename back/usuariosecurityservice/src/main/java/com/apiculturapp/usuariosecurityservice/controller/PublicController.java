package com.apiculturapp.usuariosecurityservice.controller;
import com.apiculturapp.usuariosecurityservice.entity.User;
import com.apiculturapp.usuariosecurityservice.service.JwtUtil;
import com.apiculturapp.usuariosecurityservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
@CrossOrigin(origins = "http://localhost:8080")
@RequiredArgsConstructor

public class PublicController {

    private final UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/auth/login")
    public ResponseEntity<String> login(@RequestBody User usuario) {
        User user = userService.login(usuario.getEmail(), usuario.getPassword());
        if (user != null) {
            String token = jwtUtil.generateToken(user.getUsername());
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales incorrectas");
        }
    }

    @PostMapping("/registro")
    public ResponseEntity<User> registroUsuario(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUsuario(@PathVariable Long id) {
        return ResponseEntity.ok(userService.deleteUser(id));
    }
}
