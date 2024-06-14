import org.springframework.boot.SpringApplication;

public class Main {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApplicationConfig.class);
        application.run(args);
    }
}

