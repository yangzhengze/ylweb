package cn.edu.asu.ylweb.system.service;

import cn.edu.asu.ylweb.common.service.IService;
import cn.edu.asu.ylweb.system.domain.RoleMenu;

public interface RoleMenuServie extends IService<RoleMenu> {

	void deleteRoleMenusByRoleId(String roleIds);

	void deleteRoleMenusByMenuId(String menuIds);
}
