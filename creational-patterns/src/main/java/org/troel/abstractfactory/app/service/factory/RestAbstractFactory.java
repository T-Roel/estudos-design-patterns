package org.troel.abstractfactory.app.service.factory;

import org.troel.abstractfactory.app.service.services.CarRestApiService;
import org.troel.abstractfactory.app.service.services.CarService;
import org.troel.abstractfactory.app.service.services.UserRestApiService;
import org.troel.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}
}
