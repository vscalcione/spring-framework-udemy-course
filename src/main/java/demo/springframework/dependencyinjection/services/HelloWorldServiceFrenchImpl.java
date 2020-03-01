package demo.springframework.dependencyinjection.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("french")
public class HelloWorldServiceFrenchImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Bonjour le monde!!!";
    }
}
