package demo.springframework.dependencyinjection.springboot;

import demo.springframework.dependencyinjection.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan("demo.springframework.dependencyinjection")
@ImportResource("classpath:/spring/spring-configuration.xml")
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        GreetingController controller = (GreetingController) ctx.getBean("greetingController");
        controller.sayHello();
    }

}
