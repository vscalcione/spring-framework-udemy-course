package demo.springframework.dependencyinjection.configuration;

import demo.springframework.dependencyinjection.services.*;
import demo.springframework.dependencyinjection.services.implementations.*;
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
    public HelloWorldServiceEnglishImpl helloWorldServiceEnglish(HelloWorldFactory factory){
        return (HelloWorldServiceEnglishImpl) factory.createHelloWorldService("en");
    }

    @Bean
    @Primary
    @Profile("spanish")
    public HelloWorldServiceSpanishImpl helloWorldServiceSpanish(HelloWorldFactory factory){
        return (HelloWorldServiceSpanishImpl) factory.createHelloWorldService("sp");
    }

    @Bean(name = "french")
    public HelloWorldServiceFrenchImpl helloWorldServiceFrench (HelloWorldFactory factory){
        return (HelloWorldServiceFrenchImpl) factory.createHelloWorldService("fr");
    }

    @Bean
    public HelloWorldServiceGermanImpl helloWorldServiceGerman(HelloWorldFactory factory){
        return (HelloWorldServiceGermanImpl) factory.createHelloWorldService("de");
    }

    @Bean
    public HelloWorldServicePolishImpl helloWorldServicePolish (HelloWorldFactory factory){
        return (HelloWorldServicePolishImpl) factory.createHelloWorldService("pl");
    }

    @Bean
    public HelloWorldServiceRussianImpl helloWorldServiceRussian (HelloWorldFactory factory){
        return (HelloWorldServiceRussianImpl) factory.createHelloWorldService("ru");
    }
}