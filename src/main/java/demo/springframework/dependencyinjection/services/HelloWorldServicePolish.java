package demo.springframework.dependencyinjection.services;

public class HelloWorldServicePolish implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Witaj swiecie!!!";
    }
}
