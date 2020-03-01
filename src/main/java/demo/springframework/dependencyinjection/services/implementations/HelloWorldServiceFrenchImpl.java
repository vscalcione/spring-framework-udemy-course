package demo.springframework.dependencyinjection.services.implementations;


import demo.springframework.dependencyinjection.services.HelloWorldService;
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
