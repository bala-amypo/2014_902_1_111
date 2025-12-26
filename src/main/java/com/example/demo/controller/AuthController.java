package com.example.demo.controller;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.security.CustomUserDetailsService;
import com.example.demo.security.JwtUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication", description = "Authentication endpoints")
public class AuthController {
    
    private final JwtUtil jwtUtil;
    private final CustomUserDetailsService userDetailsService = new CustomUserDetailsService();
    
    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }
    
    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody AuthRequest request) {
        if (userDetailsService.userExists(request.getUsername())) {
            return ResponseEntity.badRequest()
                .body(new AuthResponse(null, "User already exists"));
        }
        
        userDetailsService.addUser(request.getUsername(), request.getPassword());
        String token = jwtUtil.generateToken(
            request.getUsername(), 
            request.getRole() != null ? request.getRole() : "STUDENT_VIEWER",
            request.getEmail() != null ? request.getEmail() : "",
            "0"
        );
        
        return ResponseEntity.ok(new AuthResponse(token, "Registration successful"));
    }
    
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        try {
            userDetailsService.loadUserByUsername(request.getUsername());
            String token = jwtUtil.generateToken(request.getUsername(), "STUDENT_VIEWER", "", "0");
            return ResponseEntity.ok(new AuthResponse(token, "Login successful"));
        } catch (Exception e) {
            return ResponseEntity.badRequest()
                .body(new AuthResponse(null, "Invalid credentials"));
        }
    }
}