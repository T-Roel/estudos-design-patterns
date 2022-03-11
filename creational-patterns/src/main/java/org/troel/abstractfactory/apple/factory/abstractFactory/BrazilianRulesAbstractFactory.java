package org.troel.abstractfactory.apple.factory.abstractFactory;

import org.troel.abstractfactory.apple.model.certificate.BrazilianCertificate;
import org.troel.abstractfactory.apple.model.certificate.Certificate;
import org.troel.abstractfactory.apple.model.packing.BrazilianPacking;
import org.troel.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	@Override
	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	@Override
	public Packing getPacking() {
		return new BrazilianPacking();
	}
}
