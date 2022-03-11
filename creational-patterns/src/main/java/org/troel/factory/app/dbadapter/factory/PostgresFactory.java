package org.troel.factory.app.dbadapter.factory;

import org.troel.factory.app.dbadapter.db.DB;
import org.troel.factory.app.dbadapter.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}
}
