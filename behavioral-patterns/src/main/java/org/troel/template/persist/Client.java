package org.troel.template.persist;

import org.troel.template.persist.models.UserMethod;

public class Client {

	public static void main(String[] args) {
		UserMethod user = new UserMethod("user", "password");
		user.save();
		
		System.out.println("------------------");
		
		UserMethod invalidUser = new UserMethod(null, null);
		invalidUser.save();
	}
}
