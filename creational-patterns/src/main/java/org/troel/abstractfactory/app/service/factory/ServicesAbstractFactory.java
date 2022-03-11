package org.troel.abstractfactory.app.service.factory;

import org.troel.abstractfactory.app.service.services.CarService;
import org.troel.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {
	public UserService getUserService();
	public CarService getCarService();
}
