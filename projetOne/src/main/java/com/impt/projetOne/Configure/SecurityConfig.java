package com.impt.projetOne.Configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/public").permitAll() // Allow public access
                .antMatchers("/admin").hasRole("ADMIN") // Requires ADMIN role
                .anyRequest().authenticated() // All other requests require authentication
                .and()
                .formLogin()
                .loginPage("/login") // Custom login page
                .defaultSuccessUrl("/dashboard") // Redirect after successful login
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }
}
