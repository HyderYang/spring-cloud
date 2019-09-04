package hyder.user.service;

import hyder.user.dao.UserDO;
import hyder.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: 杨欢
 * @created: 2019/9/2 上午1:10
 * @description:
 */
@Service
public class UserService {

	@Autowired
	private UserDO userDO;

	public User getUser(Long id) {
		return this.userDO.selectByPrimaryKey(1L);
	}

	//	事务纾解
	//  引入jdbc启动器时即完成
	@Transactional
	public void saveUser(User user) {
		this.userDO.insert(user);
	}
}
