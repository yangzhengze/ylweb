package cn.edu.asu.ylweb.system.service;

import java.util.List;

import cn.edu.asu.ylweb.common.domain.Tree;
import cn.edu.asu.ylweb.common.service.IService;
import cn.edu.asu.ylweb.system.domain.Dept;

public interface DeptService extends IService<Dept> {

	Tree<Dept> getDeptTree();

	List<Dept> findAllDepts(Dept dept);

	Dept findByName(String deptName);

	Dept findById(Long deptId);
	
	void addDept(Dept dept);
	
	void updateDept(Dept dept);

	void deleteDepts(String deptIds);
}
