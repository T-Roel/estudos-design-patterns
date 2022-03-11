package org.troel.factory.app.dbadapter;

import org.troel.factory.app.dbadapter.db.DB;
import org.troel.factory.app.dbadapter.factory.OracleFactory;
import org.troel.factory.app.dbadapter.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		DB postDb = new PostgresFactory().getDatabase();
		DB oracleDb = new OracleFactory().getDatabase();
		postDb.query("SELECT * FROM users");
		oracleDb.update("INSERT INTO users VALUES ('User', 25)");
	}
}
