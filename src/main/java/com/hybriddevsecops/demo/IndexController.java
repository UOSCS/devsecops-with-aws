package com.hybriddevsecops.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String sayHello(Model model) {

        model.addAttribute("hello", "Hello World!");

        return "index";
    }
}
