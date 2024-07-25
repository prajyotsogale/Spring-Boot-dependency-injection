package com.third.program.example.thirdprogram;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "push ups pushups pushups";
    }
}
