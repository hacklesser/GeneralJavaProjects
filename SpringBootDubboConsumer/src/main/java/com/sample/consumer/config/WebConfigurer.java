package com.sample.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sample.consumer.filter.OriginIntercepter;

@Configuration
public class WebConfigurer extends WebMvcConfigurerAdapter{
	public void addInterceptors(InterceptorRegistry registry) {
		OriginIntercepter originIntercepter = new OriginIntercepter();
        registry.addInterceptor(originIntercepter);
    }
}
