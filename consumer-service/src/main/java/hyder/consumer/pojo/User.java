package hyder.consumer.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author: 杨欢
 * @created: 2019/9/2 上午1:24
 * @description:
 */
@Data
public class User {
	private Long id;
	private String userName;
	private String password;
	private String name;
	private Integer age;
	private Integer sex;
	private Date birthday;
	private Date created;
	private Date updated;

}
