package com.cap.springmvc.general.service.impl.config;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Security configuration based on {@link WebSecurityConfigurerAdapter}. This configuration is by purpose designed most
 * simple for two channels of authentication: simple login form and rest-url. (Copied from
 * {@link com.cap.springmvc.general.service.impl.config.BaseWebSecurityConfig}
 *
 */
// @Configuration
// @EnableWebSecurity
// @Profile(SpringProfileConstants.NOT_JUNIT)
public class WebSecurityConfig extends BaseWebSecurityConfig {

}
