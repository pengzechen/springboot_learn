package demo.GreetingTemplate;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingTemplate {
    @GetMapping("/greeting_template")
    public String greet_template(
            @RequestParam(value = "name", defaultValue = "Jack") String name,
            Model model
    ){
        model.addAttribute("name", name);
        return "greeting";
    }
}
