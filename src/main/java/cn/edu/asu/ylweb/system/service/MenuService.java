package cn.edu.asu.ylweb.system.service;

import java.util.List;

import cn.edu.asu.ylweb.common.domain.Tree;
import cn.edu.asu.ylweb.common.service.IService;
import cn.edu.asu.ylweb.system.domain.Menu;

public interface MenuService extends IService<Menu> {

	List<Menu> findUserPermissions(String userName);

	List<Menu> findUserMenus(String userName);

	List<Menu> findAllMenus(Menu menu);

	Tree<Menu> getMenuButtonTree();
	
	Tree<Menu> getMenuTree();
	
	Tree<Menu> getUserMenu(String userName);
	
	Menu findById(Long menuId);

	Menu findByNameAndType(String menuName, String type);

	void addMenu(Menu menu);

	void updateMenu(Menu menu);
	
	void deleteMeuns(String menuIds);
}
