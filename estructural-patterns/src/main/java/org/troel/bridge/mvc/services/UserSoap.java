package org.troel.bridge.mvc.services;

import org.troel.bridge.mvc.model.User;

public class UserSoap {

	public void save(User user) {
		System.out.println("Starting a save operation through Soap Protocol!");
	}
}
