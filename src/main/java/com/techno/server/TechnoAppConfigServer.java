
package com.techno.server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TechnoAppConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(TechnoAppConfigServer.class, args);
    }
}