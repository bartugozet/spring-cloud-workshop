package com.microsoft.sample.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        Random random = new Random();
        if(random.nextBoolean()){
            return Health.down().withDetail("PMR-001","Do i have to say details??").build();
        }
        return Health.up().build();
    }
}
