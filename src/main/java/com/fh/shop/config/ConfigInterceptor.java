package com.fh.shop.config;

import com.fh.shop.interceptor.InfoInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ConfigInterceptor extends WebMvcConfigurerAdapter {

    @Autowired
    private InfoInterceptor interceptor;

    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(interceptor)
                .addPathPatterns("/**");

    }

}
