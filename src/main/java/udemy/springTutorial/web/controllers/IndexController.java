package udemy.springTutorial.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "page/about";
    }
}