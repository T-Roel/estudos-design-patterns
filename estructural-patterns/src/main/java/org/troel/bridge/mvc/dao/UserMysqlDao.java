package org.troel.bridge.mvc.dao;

import org.troel.bridge.mvc.model.User;

public class UserMysqlDao implements UserDao {

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Mysql Database!");
	}
}
