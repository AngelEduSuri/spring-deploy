package com.aesuriagasalazar.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${app.varexample}")
    private String user;

    @GetMapping("/api/hello")
    public String welcome() {
        System.out.println(user);
        return "Hello User";
    }
}
