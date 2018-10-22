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
@Order(1)
public class WebSecurityConfigurerAdapter1 extends WebSecurityConfigurerAdapter {
  private static final Log LOGGER = LogFactory.getLog(WebSecurityConfigurerAdapter1.class);

  @Override
  protected void configure(HttpSecurity http) throws Exception {

    http.addFilterBefore(new UselessFilter1(), BasicAuthenticationFilter.class);

    LOGGER.info("Adapter 1 picked up: " + http);
  }
}
