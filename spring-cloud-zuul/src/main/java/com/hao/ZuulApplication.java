package com.hao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * com.hao.ZuulApplication.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 18:42
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

    private static final Logger logger = LoggerFactory.getLogger(ZuulApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(ZuulApplication.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> logger.info("### Shutdown ZuulApplication ###")));
    }

}
