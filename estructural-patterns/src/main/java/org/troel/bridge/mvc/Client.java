package org.troel.bridge.mvc;

import org.troel.bridge.mvc.dao.UserMongoDao;
import org.troel.bridge.mvc.dao.UserMysqlDao;
import org.troel.bridge.mvc.dao.UserOracleDao;
import org.troel.bridge.mvc.dao.UserPostgresDao;
import org.troel.bridge.mvc.model.User;
import org.troel.bridge.mvc.services.UserEJB;
import org.troel.bridge.mvc.services.UserRest;
import org.troel.bridge.mvc.services.UserService;
import org.troel.bridge.mvc.services.UserSoap;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
	}
}
