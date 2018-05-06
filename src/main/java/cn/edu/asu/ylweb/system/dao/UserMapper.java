package cn.edu.asu.ylweb.system.dao;

import java.util.List;

import cn.edu.asu.ylweb.common.config.MyMapper;
import cn.edu.asu.ylweb.system.domain.User;
import cn.edu.asu.ylweb.system.domain.UserWithRole;

public interface UserMapper extends MyMapper<User> {

	List<User> findUserWithDept(User user);
	
	List<UserWithRole> findUserWithRole(Long userId);
	
	User findUserProfile(User user);
}