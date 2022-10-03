package com.starter.myspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    super.configure(auth);
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .cors().disable() // Disable CORS
        .csrf().disable() // Disable CSRF
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        // Session stateless: When
        // requesting for API the server
        // know the client. But the server
        // unknow client when response data.
        .and().authorizeRequests().antMatchers("/user/register", "/user/login").anonymous()
        // if requesting to the
        // API: "/user/register" or
        // "/user/login" the
        // allowed.
        .anyRequest().authenticated(); // Other APIs must log in.
  }
}
