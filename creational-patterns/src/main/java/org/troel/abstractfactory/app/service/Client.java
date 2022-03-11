package org.troel.abstractfactory.app.service;

import org.troel.abstractfactory.app.service.factory.EJBAbstractFactory;
import org.troel.abstractfactory.app.service.factory.RestAbstractFactory;
import org.troel.abstractfactory.app.service.factory.ServicesAbstractFactory;
import org.troel.abstractfactory.app.service.services.CarService;
import org.troel.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory ejbFactory = new EJBAbstractFactory();
		ServicesAbstractFactory restFactory = new RestAbstractFactory();
		
		UserService ejbUserService = ejbFactory.getUserService();
		ejbUserService.save("Jhon");
		ejbUserService.delete(5);
		
		CarService restCarService = restFactory.getCarService();
		restCarService.save("Prius");
		restCarService.update("Tesla X");
	}
}
