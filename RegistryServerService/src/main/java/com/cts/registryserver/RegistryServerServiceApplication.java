package com.cts.registryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryServerServiceApplication.class, args);
	}

}
