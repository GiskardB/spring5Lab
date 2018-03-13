package com.services.limitsservices.controller;

import com.services.limitsservices.Configuration;
import com.services.limitsservices.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitConfiguration() {
        return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }
}
