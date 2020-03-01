package demo.springframework.dependencyinjection.configuration;

import demo.springframework.dependencyinjection.services.HelloWorldFactory;
import demo.springframework.dependencyinjection.services.HelloWorldServiceEnglishImpl;
import demo.springframework.dependencyinjection.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfiguration {

    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Primary
    @Profile("english")
    public HelloWorldServiceEnglishImpl englishImplementation(HelloWorldFactory factory){
        return (HelloWorldServiceEnglishImpl) factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    public HelloWorldServiceSpanishImpl spanishImplementation(HelloWorldFactory factory){
        return (HelloWorldServiceSpanishImpl) factory.createHelloWorldService("sp");
    }
}
