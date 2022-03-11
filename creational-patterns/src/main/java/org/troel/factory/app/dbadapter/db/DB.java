package org.troel.factory.app.dbadapter.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
