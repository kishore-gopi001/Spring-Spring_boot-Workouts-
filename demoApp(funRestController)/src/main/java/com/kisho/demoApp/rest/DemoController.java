package com.kisho.demoApp.rest;


import com.kisho.demoApp.Business_Logic.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    // the following code is considered as "field injection" no need to use constructor or setter functions.
    // Spring will do behind the scenes Automatically in Inversion of control (bean factory)
    private  Coach mycoach;

    @Autowired
    // Autowired tells a spring to inject its dependency
    // in constructor injection we simply pass the reference of bean(dependent class) in a constructor.
    // setter Injection
    public void SetCoach(Coach coach) {
        mycoach = coach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return mycoach.getDailyWorkout();
    }
}
