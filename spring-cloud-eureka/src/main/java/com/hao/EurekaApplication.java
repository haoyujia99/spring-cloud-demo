package com.hao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * com.hao.EurekaApplication.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 18:42
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    private static final Logger logger = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(EurekaApplication.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> logger.info("### Shutdown EurekaApplication ###")));
    }

}
