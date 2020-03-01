package demo.springframework.dependencyinjection.services.implementations;

import demo.springframework.dependencyinjection.services.HelloWorldService;

public class HelloWorldServiceRussianImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hello world in Russian!!!";
    }
}
