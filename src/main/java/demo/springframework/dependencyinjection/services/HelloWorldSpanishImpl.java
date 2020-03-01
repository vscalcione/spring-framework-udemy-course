package demo.springframework.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class HelloWorldSpanishImpl implements HelloWorldService{

    @Override
    public String getGreeting() {
        return "Hola mundo !!!";
    }
}
