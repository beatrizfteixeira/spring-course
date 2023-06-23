package com.biaft.springAppBia.rest;
import com.biaft.springAppBia.Coach;
import com.biaft.springAppBia.FrescoballCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerInitial {
    private Coach frescoballCoach;

    @Autowired
    public RestControllerInitial(Coach coach){
        frescoballCoach = coach;
    }
    // Injecting custom application properties
    @Value("${default.name}")
    private String name;
    @GetMapping("/")
    public String sayHello() {  // endpoint
        return "Hello worldao" + " " + name;
    }
    @GetMapping("/ola") // endpoint
    public String sayYo() {
        return "uepa yo";
    }
    @GetMapping("/workout") // endpoint
    public String coach() {
        return frescoballCoach.getTraining();
    }
}
