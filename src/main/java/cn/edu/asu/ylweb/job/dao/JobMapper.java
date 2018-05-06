package cn.edu.asu.ylweb.job.dao;

import cn.edu.asu.ylweb.common.config.MyMapper;
import cn.edu.asu.ylweb.job.domain.Job;

import java.util.List;

public interface JobMapper extends MyMapper<Job> {
	
	List<Job> queryList();
}