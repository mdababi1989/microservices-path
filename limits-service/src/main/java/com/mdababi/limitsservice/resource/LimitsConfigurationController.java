package com.mdababi.limitsservice.resource;

import com.mdababi.limitsservice.domain.LimitConfiguration;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LimitsConfigurationController {

    private LimitConfiguration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
} 
