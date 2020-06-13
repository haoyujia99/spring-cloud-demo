package com.hao.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import com.hao.client.CityProviderClient;

/**
 * com.hao.config.FeignConfig.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 18:23
 */
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.hao")
@Configuration
public class FeignConfig {

}
