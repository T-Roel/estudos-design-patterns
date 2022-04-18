package org.troel.bridge.mvc.services;

import org.troel.bridge.mvc.dao.UserDao;
import org.troel.bridge.mvc.model.User;

public abstract class UserService {
	protected UserDao dao;
	
	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
