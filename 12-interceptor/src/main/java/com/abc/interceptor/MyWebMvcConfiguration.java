package com.abc.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2021/1/18
 */
@Configuration
public class MyWebMvcConfiguration extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //拦截所有以first开头的请求路径
        // registry.addInterceptor(new SomeInterceptor()).addPathPatterns("/first/**");
        // 除了以first开头的，其他都拦截
        registry.addInterceptor(new SomeInterceptor()).excludePathPatterns("/first/**");

    }
}
