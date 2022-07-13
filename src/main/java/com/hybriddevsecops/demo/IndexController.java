package com.hybriddevsecops.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.*;

import java.util.Base64;
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

         String AWS_ACCESS_KEY_ID = "LX0GLCEUBRCR7947EE80";
         String AWS_SECRET_KEY = "AXaGWTSfZlHEnZ1PIzjuljceMF11rdz8cvd58=rS";

         Logger LOG = Logger.getGlobal();

         LOG.info("AWS_ACCESS_KEY_ID: " + AWS_ACCESS_KEY_ID);
         LOG.info("AWS_SECRET_KEY: " + AWS_SECRET_KEY);

//        JsonNode secretsJson  =  new ObjectMapper().readTree(secret);
//        String AWS_ACCESS_KEY_ID = secretsJson.get("AWS_ACCESS_KEY_ID").textValue();
//        String AWS_SECRET_KEY = secretsJson.get("AWS_SECRET_KEY").textValue();
    }
}
