package com.metro.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.metro")
@EnableEurekaClient
@EntityScan(basePackages = "com.metro.bean")
@EnableJpaRepositories(basePackages = "com.metro.persistence")
public class MetroStationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetroStationServiceApplication.class, args);
	}
}