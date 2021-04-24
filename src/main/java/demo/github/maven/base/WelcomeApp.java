package demo.github.maven.base;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeApp {
    public static void main(String[] args) {
        SpringApplication.run(WelcomeApp.class, args);
        System.out.println("Hello Philip...");
    }
}