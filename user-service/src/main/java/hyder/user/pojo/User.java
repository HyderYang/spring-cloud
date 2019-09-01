package hyder.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: 杨欢
 * @created: 2019/9/2 上午1:06
 * @description:
 */
@Data
@Table(name = "sb_user")
public class User {
	@Id
	@KeySql(useGeneratedKeys = true)
	private Long id;
	private String userName;
	private String password;
	private String name;
	private Integer age;
	private Integer sex;
	private Date birthday;
	private Date created;
	private Date updated;

//	@Transient
//	private String noUseField;
}
