package hyder.consumer.client;

import hyder.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: 杨欢
 * @created: 2019/9/3 下午10:45
 * @description:
 */
@FeignClient("user-service")
public interface UserClient {

	@GetMapping("/user/{id}")
	User queryByID(@PathVariable("id") Long id);
}
