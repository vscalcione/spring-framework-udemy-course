package demo.springframework.dependencyinjection.services;

public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language){
        HelloWorldService service = null;

        switch (language){
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            case "de":
                service = new HelloWorldServiceGerman();
                break;
            case "pl":
                service = new HelloWorldServicePolish();
                break;
            case "ru":
                service = new HelloWorldServiceRussian();
                break;
            default: new HelloWorldServiceEnglishImpl();
        }
        return service;
    }
}
