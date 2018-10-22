package com.example.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Component;

@EnableWebSecurity (debug = true)
@Component
@Order(2)
public class WebSecurityConfigurerAdapter2 extends WebSecurityConfigurerAdapter {
    private static final Log LOGGER = LogFactory.getLog(WebSecurityConfigurerAdapter2.class);

    @Override
    protected void configure(HttpSecurity http) throws Exception {

      http.addFilterBefore(new UselessFilter2(), BasicAuthenticationFilter.class);

      LOGGER.info("Adapter 2 picked up: " + http);
    }
  }
