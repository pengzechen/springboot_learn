package demo.GreetingJson;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingJson {

    private static final String template = "Hello, %s, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")  // @RequestMapping(method=GET)
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "Jack") String name,
            @RequestParam(value = "pass", defaultValue = "None") String pass
    ) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name, pass));
    }

}