package org.example.projet_pfe.controller;


import org.example.projet_pfe.dto.AuthRequest;
import org.example.projet_pfe.dto.RegisterRequest;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import org.example.projet_pfe.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor

public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {

        return authService.register(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {

        return authService.login(request);
    }

}
