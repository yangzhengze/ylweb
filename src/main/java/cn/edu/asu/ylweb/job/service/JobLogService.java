package cn.edu.asu.ylweb.job.service;

import java.util.List;

import cn.edu.asu.ylweb.common.service.IService;
import cn.edu.asu.ylweb.job.domain.JobLog;

public interface JobLogService extends IService<JobLog>{

	List<JobLog> findAllJobLogs(JobLog jobLog);

	void saveJobLog(JobLog log);
	
	void deleteBatch(String jobLogIds);
}
