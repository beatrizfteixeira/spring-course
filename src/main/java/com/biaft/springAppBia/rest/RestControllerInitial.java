package com.biaft.springAppBia.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerInitial {
    @GetMapping("/")
    public String sayHello() {  // endpoint
        return "Hello worldao";
    }
    @GetMapping("/ola") // endpoint
    public String sayYo() {
        return "uepa yo";
    }

}
