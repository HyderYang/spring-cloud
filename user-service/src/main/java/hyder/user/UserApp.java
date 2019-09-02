package hyder.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author: 杨欢
 * @created: 2019/9/2 上午12:58
 * @description:
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("hyder.user.dao")
public class UserApp {

	public static void main(String[] args) {
		SpringApplication.run(UserApp.class);
	}
}
