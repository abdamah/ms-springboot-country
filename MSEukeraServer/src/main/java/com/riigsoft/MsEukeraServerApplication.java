package com.riigsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author Abdallah Mahmoud
 * EurekaServer for registory and identificatoin of service instances.
 * **/
@EnableEurekaServer
@SpringBootApplication
public class MsEukeraServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEukeraServerApplication.class, args);
	}

}
