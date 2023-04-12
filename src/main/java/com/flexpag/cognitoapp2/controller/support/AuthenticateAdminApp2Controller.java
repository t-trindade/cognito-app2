package com.flexpag.cognitoapp2.controller.support;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("hasAuthority('IT/ADMIN')")
public class AuthenticateAdminApp2Controller {

    @GetMapping("/support/admin")
    public String authSupport() {
        return "Sou App2 e estou autenticado como admin!!";
    }
}
