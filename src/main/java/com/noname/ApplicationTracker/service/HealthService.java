package com.noname.ApplicationTracker.service;

import com.noname.ApplicationTracker.dto.HealthDTO;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public HealthDTO HealthCheck(){
        return new HealthDTO("UP");
    }
}
