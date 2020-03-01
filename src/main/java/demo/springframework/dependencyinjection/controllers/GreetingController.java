package demo.springframework.dependencyinjection.controllers;

import demo.springframework.dependencyinjection.services.HelloWorldService;
import demo.springframework.dependencyinjection.services.implementations.HelloWorldServiceGermanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldGermanService;
    private HelloWorldService helloWorldFrenchService;

    public GreetingController() {
    }

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("helloWorldServiceGerman")
    public void setHelloWorldGermanService(HelloWorldServiceGermanImpl helloWorldGermanService) {
        this.helloWorldGermanService = helloWorldGermanService;
    }

    @Autowired
    @Qualifier("french")
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldFrenchService = helloWorldServiceFrench;
    }

    public String sayHello(){
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        System.out.println(helloWorldGermanService.getGreeting());
        System.out.println(helloWorldFrenchService.getGreeting());
        return greeting;
    }
}
