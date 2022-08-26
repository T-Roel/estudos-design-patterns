package org.troel.mediator.translate.mediator;

import org.troel.mediator.translate.model.User;
import org.troel.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {

	private Translator translator = new Translator();

	@Override
	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}
