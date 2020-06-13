package com.hao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * com.hao.config.ConsumerConfig.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 18:23
 */
@Configuration
public class ConsumerConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
