package org.troel.factory.app.dbadapter.factory;

import org.troel.factory.app.dbadapter.db.DB;
import org.troel.factory.app.dbadapter.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
