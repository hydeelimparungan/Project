import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Spring {

    public static void main(String[] args) {
        SpringApplication.run(Spring.class, args);
    }
}

@RestController
class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring!";
    }
}
