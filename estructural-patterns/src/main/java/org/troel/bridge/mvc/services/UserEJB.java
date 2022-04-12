package org.troel.bridge.mvc.services;

import org.troel.bridge.mvc.model.User;

public class UserEJB {

	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
	}
}
