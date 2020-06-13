package com.hao.config;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * com.hao.config.HystrixConfig.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 18:23
 */
@EnableCircuitBreaker
@EnableEurekaClient
@Configuration
public class HystrixConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
