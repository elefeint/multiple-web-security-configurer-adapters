package com.example.example;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UselessFilter1 implements Filter {
  private static final Log LOGGER = LogFactory.getLog(UselessFilter1.class);

  @Override public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override public void destroy() {

  }

  @Override public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
    LOGGER.info("Filter 1 executed: " + filterChain);
    filterChain.doFilter(servletRequest, servletResponse);
  }

  @Override public String toString() {
    return "FILTER 1";
  }
}
