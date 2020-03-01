package demo.springframework.dependencyinjection.configuration;


import demo.springframework.dependencyinjection.services.HelloWorldServiceEnglishImpl;
import demo.springframework.dependencyinjection.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfiguration {

    @Bean
    @Profile("english")
    public HelloWorldServiceEnglishImpl englishImplementation(){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Primary
    @Profile("spanish")
    public HelloWorldServiceSpanishImpl spanishImplementation(){
        return new HelloWorldServiceSpanishImpl();
    }
}
