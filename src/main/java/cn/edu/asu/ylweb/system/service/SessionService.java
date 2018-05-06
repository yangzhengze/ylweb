package cn.edu.asu.ylweb.system.service;

import java.util.List;

import cn.edu.asu.ylweb.system.domain.UserOnline;

public interface SessionService {

	List<UserOnline> list();

	boolean forceLogout(String sessionId);
}
