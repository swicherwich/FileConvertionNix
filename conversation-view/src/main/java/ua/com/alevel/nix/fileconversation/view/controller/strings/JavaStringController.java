package ua.com.alevel.nix.fileconversation.view.controller.strings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = { "/", "/java_string"})
public class JavaStringController {

    @GetMapping
    public String index() {
        return "page/strings/java_string";
    }
}
