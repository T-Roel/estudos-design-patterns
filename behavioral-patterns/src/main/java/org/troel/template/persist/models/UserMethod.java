package org.troel.template.persist.models;

public class UserMethod extends ModelPersist {
	protected String username;
	protected String password;
	
	public UserMethod(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	protected void preSave() {
		System.out.println("Checking if there is another user with the same username...");
	}
	
	@Override
	protected void prePersist() {
		if(username == null) {
			throw new RuntimeException("Username not defined...");
		}
		if(password == null) {
			throw new RuntimeException("Password not defined...");
		}
	}
	
	@Override
	protected void postSave() {
		System.out.println("Creating user roles");
	}
}
