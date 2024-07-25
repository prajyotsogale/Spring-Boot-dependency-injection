package com.third.program.example.thirdprogram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach mycoach;

    @Autowired
    public DemoController(Coach abcc){
        mycoach = abcc;
    }

    @GetMapping("/workout")
    public String workoutS(){
        return mycoach.getDailyWorkout();
    }

    @GetMapping("/")
    public String giveInfo(){
        return "The program is working..";
    }
    @GetMapping("/fortune")
    public String fortuneP(){
        return "Today is your lucky day";
    }
}
