package io.github.youthred.vom.web.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexModel {

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("index", "a", "123123");
    }
}
