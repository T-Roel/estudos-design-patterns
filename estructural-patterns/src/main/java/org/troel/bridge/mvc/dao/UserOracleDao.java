package org.troel.bridge.mvc.dao;

import org.troel.bridge.mvc.model.User;

public class UserOracleDao implements UserDao {

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Oracle Database!");
	}
}
