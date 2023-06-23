package com.biaft.springAppBia;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
    @Override
    public String getTraining() {
        return "GO play 20min ball hop!";
    }
}