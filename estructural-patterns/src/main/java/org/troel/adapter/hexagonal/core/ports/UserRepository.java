package org.troel.adapter.hexagonal.core.ports;

import java.util.List;

import org.troel.adapter.hexagonal.core.model.User;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
