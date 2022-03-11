package org.troel.abstractfactory.apple.factory.abstractFactory;

import org.troel.abstractfactory.apple.model.certificate.Certificate;
import org.troel.abstractfactory.apple.model.certificate.USCertificate;
import org.troel.abstractfactory.apple.model.packing.Packing;
import org.troel.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	@Override
	public Certificate getCertificates() {
		return new USCertificate();
	}

	@Override
	public Packing getPacking() {
		return new USPacking();
	}
}
