package apope.springframework.controllers;

import apope.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

/*
Created by apope on 08/06/2019
 */

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!!");

        return greetingService.sayGreeting();
    }
}
