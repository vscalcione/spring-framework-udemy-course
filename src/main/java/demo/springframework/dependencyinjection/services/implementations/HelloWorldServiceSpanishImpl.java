package demo.springframework.dependencyinjection.services.implementations;

import demo.springframework.dependencyinjection.services.HelloWorldService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hola mundo !!!";
    }
}
