package org.troel.bridge.mvc.services;

import org.troel.bridge.mvc.dao.UserDao;
import org.troel.bridge.mvc.model.User;

public class UserSoap extends UserService {

	public UserSoap(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through Soap Protocol!");
	}
}
