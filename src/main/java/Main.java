import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
@EnableAutoConfiguration
@RestController
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @RequestMapping("/")
  public String greeting(){
    return "Hello world!";
  }

  @RequestMapping("/Greeting")
  public String greeting(@RequestParam(name="name", defaultValue="world") String name) {
      return String.format("Hello %s!", name);
  }
}