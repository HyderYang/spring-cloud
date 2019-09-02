package hyder.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 杨欢
 * @created: 2019/9/2 上午1:22
 * @description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApp {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApp.class);
	}
}
