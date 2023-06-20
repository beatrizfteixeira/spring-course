package com.biaft.springAppBia.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerInitial {
    @GetMapping("/")
    public String sayHello() {
        return "Hello worldao";
    }

}
