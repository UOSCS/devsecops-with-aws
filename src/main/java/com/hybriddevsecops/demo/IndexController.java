package com.hybriddevsecops.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class IndexController {

    @GetMapping("/")
    public String sayHello(Model model) {

        model.addAttribute("title", "DevSecOps with AWS");

        triggerNonCompliance();

        return "index";
    }

    public void triggerNonCompliance() {

        String SAMPLE_ACCESS_KEY = "ML686RDFZUWOHYHCQQTG";
        String SAMPLE_SECRET_KEY = "65goffb7GXeE1e/dTPVrEm26LHGvr3M4LoXg5/pj";

        Logger LOG = Logger.getGlobal();

        LOG.info(SAMPLE_ACCESS_KEY);
        LOG.info(SAMPLE_SECRET_KEY);
    }
}
