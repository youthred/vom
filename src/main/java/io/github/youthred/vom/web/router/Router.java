package io.github.youthred.vom.web.router;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Router {

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }
}
