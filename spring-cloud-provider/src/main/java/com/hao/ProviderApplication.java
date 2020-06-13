package com.hao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * com.hao.ProviderApplication.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 10:44
 */
@EnableEurekaClient
@SpringBootApplication
public class ProviderApplication {

    private static final Logger logger = LoggerFactory.getLogger(ProviderApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(ProviderApplication.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> logger.info("### Shutdown ProviderApplication ###")));
    }

}
