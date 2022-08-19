package org.troel.facade.callCenter.services;

import java.util.List;

import org.troel.facade.callCenter.model.Card;
import org.troel.facade.callCenter.model.Register;

public class CallCenterFacade {
	
	private CardService cardService;
	private RegisterService registerService;
	private ReportService reportService;
	private PaymentService paymentService;
	private SecurityService securityService;
	
	public CallCenterFacade() {
		cardService = new CardService();
		registerService = new RegisterService();
		reportService = new ReportService(registerService);
		paymentService = new PaymentService(registerService);
		securityService = new SecurityService(cardService, registerService);
	}
	
	public Card getCardByUser(Long id) {
		return cardService.getCardByUser(id);
	}
	
	public void getSumary(Card card) {
		reportService.getSumary(card);
	}
	
	public void getPaymentInfoByCard(Card card) {
		paymentService.getPaymentInfoByCard(card);
	}
	
	public void cancelLastRegister(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);
	}
}
