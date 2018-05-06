package cn.edu.asu.ylweb.system.service;

import cn.edu.asu.ylweb.common.service.IService;
import cn.edu.asu.ylweb.system.domain.UserRole;

public interface UserRoleService extends IService<UserRole> {

	void deleteUserRolesByRoleId(String roleIds);

	void deleteUserRolesByUserId(String userIds);
}
