package com.noname.applicationtracker.service;

import com.noname.applicationtracker.dto.HealthDTO;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public HealthDTO HealthCheck(){
        return new HealthDTO("UP");
    }
}
