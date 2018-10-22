package com.example.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
  private static final Log LOGGER = LogFactory.getLog(ExampleController.class);


  @RequestMapping("/")
  public String home() {
    return "whatever";
  }

}

