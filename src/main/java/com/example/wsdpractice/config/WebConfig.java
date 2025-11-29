package com.example.wsdpractice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final ApiLogger apiLogger;

    public WebConfig(ApiLogger apiLogger) {
        this.apiLogger = apiLogger;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLogger)
                .addPathPatterns("/api/**");
    }
}