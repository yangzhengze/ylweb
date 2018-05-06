package cn.edu.asu.ylweb.system.service;

import java.util.List;

import cn.edu.asu.ylweb.common.service.IService;
import cn.edu.asu.ylweb.system.domain.SysLog;

public interface LogService extends IService<SysLog> {
	
	List<SysLog> findAllLogs(SysLog log);
	
	void deleteLogs(String logIds);
}
