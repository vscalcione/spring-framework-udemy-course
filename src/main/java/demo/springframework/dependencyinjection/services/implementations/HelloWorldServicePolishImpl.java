package demo.springframework.dependencyinjection.services.implementations;

import demo.springframework.dependencyinjection.services.HelloWorldService;

public class HelloWorldServicePolishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Witaj swiecie!!!";
    }
}
