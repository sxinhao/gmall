package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * 解决跨域问题配置类
 */

@Configuration
public class GmallCorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){

        //CorsConfiguration跨域配置对象
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("http://localhost:1000");
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedOrigin("*");  //允许所有的方法进行跨域
        corsConfiguration.addAllowedHeader("*"); //允许所有的头信息进行跨域

        //配置源对象
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**",corsConfiguration);

        //返回Cors过滤器对象
        return new CorsWebFilter(configurationSource);
    }
}
