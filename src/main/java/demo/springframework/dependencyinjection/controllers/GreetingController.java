package demo.springframework.dependencyinjection.controllers;

import demo.springframework.dependencyinjection.services.HelloWorldService;
import demo.springframework.dependencyinjection.services.implementations.HelloWorldServiceGermanImpl;

public class GreetingController {

    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceGerman;
    private HelloWorldService helloWorldServiceFrench;

    public GreetingController() {
    }


    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void setHelloWorldServiceGerman(HelloWorldServiceGermanImpl helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

    public String sayHello(){
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        System.out.println(helloWorldServiceGerman.getGreeting());
        System.out.println(helloWorldServiceFrench.getGreeting());
        return greeting;
    }
}
