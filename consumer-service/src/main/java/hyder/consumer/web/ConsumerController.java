package hyder.consumer.web;

import com.netflix.appinfo.InstanceInfo;
import hyder.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: 杨欢
 * @created: 2019/9/2 上午1:26
 * @description:
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/{id}")
	public User getUserByID(@PathVariable("id") Long id){
		// 根据服务ID获取实例
		List<ServiceInstance> instancesById = this.discoveryClient.getInstances("user-service");
		ServiceInstance info = instancesById.get(0);
		String url = "http://" + info.getHost() + ":" + info.getPort() + "/user/" + id;
//		String url = "http://localhost:8081/user/" + id;
		return this.restTemplate.getForObject(url, User.class);
	}
}
