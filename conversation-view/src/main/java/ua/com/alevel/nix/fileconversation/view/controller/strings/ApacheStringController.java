package ua.com.alevel.nix.fileconversation.view.controller.strings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apache_string")
public class ApacheStringController {

    @GetMapping
    public String index() {
        return "page/strings/apache_string";
    }
}
