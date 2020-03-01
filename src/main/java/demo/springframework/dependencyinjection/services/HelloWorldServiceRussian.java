package demo.springframework.dependencyinjection.services;

public class HelloWorldServiceRussian implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hello world in Russian!!!";
    }
}
