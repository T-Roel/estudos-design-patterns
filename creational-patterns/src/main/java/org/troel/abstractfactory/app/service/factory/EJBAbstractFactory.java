package org.troel.abstractfactory.app.service.factory;

import org.troel.abstractfactory.app.service.services.CarEJBService;
import org.troel.abstractfactory.app.service.services.CarService;
import org.troel.abstractfactory.app.service.services.UserEJBService;
import org.troel.abstractfactory.app.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}
}
