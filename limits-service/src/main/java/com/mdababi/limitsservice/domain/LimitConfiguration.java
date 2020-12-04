package com.mdababi.limitsservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Setter
@ConfigurationProperties("limits-service")
public class LimitConfiguration {
    private int maximum;
    private int minimum;

}  
