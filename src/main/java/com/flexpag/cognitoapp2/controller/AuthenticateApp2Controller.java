package com.flexpag.cognitoapp2.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("hasAuthority('IT/INTERNAL')")
public class AuthenticateApp2Controller {

    @GetMapping("/autenticar")
    public String auth() {
        return "Sou App2 e estou autenticado!!";
    }
}
