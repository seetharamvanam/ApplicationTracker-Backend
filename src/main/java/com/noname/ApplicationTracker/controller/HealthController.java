package com.noname.ApplicationTracker.controller;

import com.noname.ApplicationTracker.dto.HealthDTO;
import com.noname.ApplicationTracker.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Autowired
    HealthService healthService;

    @GetMapping("/health")
    public HealthDTO health(){
        return healthService.HealthCheck();
    }
}
