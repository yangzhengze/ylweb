package cn.edu.asu.ylweb.system.dao;

import java.util.List;

import cn.edu.asu.ylweb.common.config.MyMapper;
import cn.edu.asu.ylweb.system.domain.Role;
import cn.edu.asu.ylweb.system.domain.RoleWithMenu;

public interface RoleMapper extends MyMapper<Role> {
	
	List<Role> findUserRole(String userName);
	
	List<RoleWithMenu> findById(Long roleId);
}