package org.troel.command.alexa.commands;

import org.troel.command.alexa.lights.GenericLight;

public class TurnLightOnCommand implements Command {
	
	private GenericLight light;
	
	public TurnLightOnCommand(GenericLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}
}
