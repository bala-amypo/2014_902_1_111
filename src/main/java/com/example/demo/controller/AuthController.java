package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest req) {
        return new AuthResponse(JwtUtil.generateToken(req.getUsername()));
    }

    @PostMapping("/register")
    public String register(@RequestBody AuthRequest req) {
        return "registered";
    }
}
