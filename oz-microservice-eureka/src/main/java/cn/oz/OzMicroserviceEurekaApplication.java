package cn.oz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OzMicroserviceEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(OzMicroserviceEurekaApplication.class, args);
	}
}
