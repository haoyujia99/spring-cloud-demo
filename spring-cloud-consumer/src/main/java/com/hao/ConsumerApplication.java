package com.hao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * com.hao.ConsumerApplication.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 18:01
 */
@SpringBootApplication
public class ConsumerApplication {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(ConsumerApplication.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> logger.info("### Shutdown ConsumerApplication ###")));
    }

}
