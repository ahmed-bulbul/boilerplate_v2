package com.bulbul.boilerplate.common.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class RequestHandlingInterceptorAppConfig implements WebMvcConfigurer {
    RequestHandlingInterceptor requestHandlingInterceptor;
    @Autowired
    public RequestHandlingInterceptorAppConfig(RequestHandlingInterceptor requestHandlingInterceptor) {
        this.requestHandlingInterceptor = requestHandlingInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestHandlingInterceptor);
    }
}