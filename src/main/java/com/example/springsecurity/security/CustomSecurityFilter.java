package com.example.springsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class CustomSecurityFilter {
    @Bean
    public SecurityFilterChain userSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests((req) -> req
                        .antMatchers("/user").authenticated()
                        .antMatchers("/admin").hasRole("ADMIN")
                        .antMatchers("/")
                )
                .formLogin((form) -> form
                        .loginPage("/login")
                        .loginProcessingUrl("/login")
                        .failureUrl("/login")
                        .permitAll())
                .logout((logout) -> logout.permitAll());

        return http.build();
    }
}
