package demo.springframework.dependencyinjection.controllers;

import demo.springframework.dependencyinjection.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloWorldService service;

    public GreetingController() {
    }

    @Autowired
    public GreetingController(HelloWorldService service) {
        this.service = service;
    }

    public String sayHello(){
        String greeting = service.getGreeting();
        System.out.println(greeting);
        return greeting;
    }
}
