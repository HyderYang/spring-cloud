package hyder.user.web;

import hyder.user.pojo.User;
import hyder.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 杨欢
 * @created: 2019/9/2 上午1:13
 * @description:
 */
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	public User getUserByID(@PathVariable("id") Long id){
		return this.userService.getUser(id);
	}
}
