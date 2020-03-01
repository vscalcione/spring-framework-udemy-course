package demo.springframework.dependencyinjection.services;

public class HelloWorldServiceGerman implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hallo Welt!!!";
    }
}
