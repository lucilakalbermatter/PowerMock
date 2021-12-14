package main.java;

public class Utility {

    private static HelloService helloService;
    private GreetingService greetingService;

    public static String sayHello(String name) {
        return helloService.sayHello(name);
    }

    public String getGreetingMessage(String name) {
        return getMessage(name);
    }

    private String getMessage(String name) {
        return greetingService.getGreetingMessage(name);
    }

    public final String getCongratsMessage(String name) {
        return greetingService.getCongratsMessage(name);
    }

}