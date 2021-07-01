package com.riigsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @Author Abdallah Mahmoud
 * EurekaClient : It enables to allow to register/publish service
 * By using provided URL.
 * **/
@EnableEurekaClient
@SpringBootApplication
public class MsCountryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCountryApiApplication.class, args);
	}

}
