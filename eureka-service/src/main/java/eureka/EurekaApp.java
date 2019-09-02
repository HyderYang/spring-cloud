package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: 杨欢
 * @created: 2019/9/2 下午4:19
 * @description:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApp {
	public static void main(String[] args) {
		SpringApplication.run(EurekaApp.class);
	}
}
