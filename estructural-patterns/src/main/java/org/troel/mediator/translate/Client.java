package org.troel.mediator.translate;

import org.troel.mediator.translate.mediator.Mediator;
import org.troel.mediator.translate.model.EnglishUser;
import org.troel.mediator.translate.model.PortugueseUser;
import org.troel.mediator.translate.model.User;

public class Client {

	public static void main(String[] args) {
		Mediator chatRoom = null;
		
		User alan = new EnglishUser("Alan", chatRoom);
		User jose = new PortugueseUser("Jose", chatRoom);
		User sue = new EnglishUser("Sue", chatRoom);
		User maria = new PortugueseUser("Maria", chatRoom);
		
		chatRoom.addUser(alan);
		chatRoom.addUser(sue);
		chatRoom.addUser(maria);
		
		alan.sendMessage("Hello");
		maria.sendMessage("Oi", alan);
		
		chatRoom.removeUser(sue);
		
		alan.sendMessage("How are you?", maria);
		maria.sendMessage("Estou bem, obrigado.", alan);
		
		chatRoom.addUser(jose);
		
		jose.sendMessage("Oi");
		
		chatRoom.removeUser(maria);
	}
	
}