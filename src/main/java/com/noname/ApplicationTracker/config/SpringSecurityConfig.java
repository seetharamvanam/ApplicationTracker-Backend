package com.noname.ApplicationTracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth ->
                auth.requestMatchers("/health","/auth/**").permitAll().anyRequest().authenticated());
        return httpSecurity.build();
    }
}
