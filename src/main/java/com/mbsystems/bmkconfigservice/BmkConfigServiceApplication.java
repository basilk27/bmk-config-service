package com.mbsystems.bmkconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BmkConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmkConfigServiceApplication.class, args);
    }

}
