package demo.springframework.dependencyinjection.services.implementations;

import demo.springframework.dependencyinjection.services.HelloWorldService;

public class HelloWorldServiceGermanImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hallo Welt!!!";
    }
}
