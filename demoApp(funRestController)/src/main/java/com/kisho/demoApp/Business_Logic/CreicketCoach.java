package com.kisho.demoApp.Business_Logic;


import org.springframework.stereotype.Component;


@Component // mark the class as a Spring bean
// it is used to make the bean available for dependency injection

public class CreicketCoach implements Coach {

    public CreicketCoach() {
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling for 15 minutes::))";
    }
}
