package org.troel.abstractfactory.apple.factory.abstractFactory;

import org.troel.abstractfactory.apple.model.certificate.Certificate;
import org.troel.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	Packing getPacking();
}
