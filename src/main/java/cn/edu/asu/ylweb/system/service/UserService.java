package cn.edu.asu.ylweb.system.service;

import java.util.List;

import cn.edu.asu.ylweb.common.service.IService;
import cn.edu.asu.ylweb.system.domain.User;
import cn.edu.asu.ylweb.system.domain.UserWithRole;

public interface UserService extends IService<User> {

	UserWithRole findById(Long userId);
	
	User findByName(String userName);

	List<User> findUserWithDept(User user);

	void registUser(User user);

	void updateTheme(String theme, String userName);

	void addUser(User user, Long[] roles);

	void updateUser(User user, Long[] roles);
	
	void deleteUsers(String userIds);

	void updateLoginTime(String userName);
	
	void updatePassword(String password);
	
	User findUserProfile(User user);
	
	void updateUserProfile(User user);
}
