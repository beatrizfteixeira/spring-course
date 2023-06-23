package com.biaft.springAppBia.rest;
import com.biaft.springAppBia.Coach;
import com.biaft.springAppBia.FrescoballCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerInitial {
    private String name;
    private Coach myCoach;
    @Autowired
    public RestControllerInitial (@Qualifier("basketballCoach")Coach coach){ // FIRST CHARACTER LOWER CASE !!
        myCoach = coach;
    }
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
        return myCoach.getTraining();
    }
}
