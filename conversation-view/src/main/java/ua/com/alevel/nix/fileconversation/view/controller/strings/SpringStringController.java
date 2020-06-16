package ua.com.alevel.nix.fileconversation.view.controller.strings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring_string")
public class SpringStringController {

    @GetMapping
    public String index() {
        return "page/strings/spring_string";
    }
}
