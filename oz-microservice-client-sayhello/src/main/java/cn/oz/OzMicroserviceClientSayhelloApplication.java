package cn.oz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class OzMicroserviceClientSayhelloApplication {
	public static void main(String[] args) {
		SpringApplication.run(OzMicroserviceClientSayhelloApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/sayhi")
	public String sayHi(@RequestParam(value = "name", required = false, defaultValue = "Unnamed")String name){
		return "Hi " + name + ", 这是来自" + this.port + "的欢迎信息！";
	}
}
