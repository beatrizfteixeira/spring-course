package com.biaft.springAppBia;

import org.springframework.stereotype.Component;

@Component // marks the class as a SpringBean
public class FrescoballCoach implements Coach{

    @Override
    public String getTraining() {
        return "Go play uninterrupted 127 hours at the beach";
    }
}
