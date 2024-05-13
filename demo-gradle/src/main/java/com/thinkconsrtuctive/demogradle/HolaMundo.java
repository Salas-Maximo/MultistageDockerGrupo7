package com.thinkconsrtuctive.demogradle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaMundo {

    @GetMapping("/")
    public String hello() {
        return "hello"; // Thymeleaf will resolve this to "hello.html" in the templates directory
    }
}
