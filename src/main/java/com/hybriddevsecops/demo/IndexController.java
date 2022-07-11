package com.hybriddevsecops.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class IndexController {
    
    private final String AWS_ACCESS_KEY = "LX0GLCEUBRCR7947EE80";
    private final String AWS_SECRET_KEY = "AXaGWTSfZlHEnZ1PIzjuljceMF11rdz8cvd58=rS";

    @GetMapping("/")
    public String sayHello(Model model) {

        model.addAttribute("title", "DevSecOps with AWS");

        triggerNonCompliance();

        return "index";
    }

    // public void triggerNonCompliance() {

    //     String AWS_ACCESS_KEY = "LX0GLCEUBRCR7947EE80";
    //     String AWS_SECRET_KEY = "AXaGWTSfZlHEnZ1PIzjuljceMF11rdz8cvd58=rS";

    //     Logger LOG = Logger.getGlobal();

    //     LOG.info(AWS_ACCESS_KEY);
    //     LOG.info(AWS_SECRET_KEY);
    // }
}
