package apope.springframework.services;

public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, I was just injected by a getter";
    }
}
