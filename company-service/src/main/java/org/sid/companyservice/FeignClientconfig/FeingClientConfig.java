package org.sid.companyservice.FeignClientconfig;

import org.springframework.context.annotation.Bean;
import feign.RequestInterceptor;
public class FeingClientConfig {
    @Bean
    public RequestInterceptor requestInterceptor(){
        return requestTemplate->{
            requestTemplate.header("Content-Type","application/json");
            requestTemplate.header("Accept","application/json");
            requestTemplate.header("Authorization"," Bearer 8ddabcc9-a0a2-3e8a-841d-dd1355abc076");
        };
    }
}
