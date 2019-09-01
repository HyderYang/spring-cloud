package hyder.consumer.web;

import hyder.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

	@GetMapping("/{id}")
	public User getUserByID(@PathVariable("id") Long id){
		String url = "http://localhost:8081/user/" + id;
		return this.restTemplate.getForObject(url, User.class);
	}
}
