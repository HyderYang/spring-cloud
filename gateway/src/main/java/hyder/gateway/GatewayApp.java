package hyder.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: 杨欢
 * @created: 2019/9/3 下午11:27
 * @description:
 */
@EnableZuulProxy
@SpringCloudApplication
public class GatewayApp {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApp.class);
	}
}
