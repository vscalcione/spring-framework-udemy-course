package demo.springframework.dependencyinjection;


import demo.springframework.dependencyinjection.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyinjectionApplication.class, args);
        GreetingController controller = (GreetingController) ctx.getBean("greetingController");
        controller.sayHello();
    }

}
