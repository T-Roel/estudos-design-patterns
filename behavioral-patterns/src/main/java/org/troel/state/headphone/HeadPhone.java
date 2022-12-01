package org.troel.state.headphone;

import org.troel.state.headphone.states.HPState;
import org.troel.state.headphone.states.OffState;

public class HeadPhone {
	private boolean isOn;
	private boolean isPlaying;
	private HPState state;
	
	public HeadPhone() {
		this.isOn = false;
		this.isPlaying = false;
		this.state = OffState.getInstance();
	}
	
	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public HPState getState() {
		return state;
	}

	public void setState(HPState instance) {
		this.state = instance;
	}
	
	public void onLongClick() {
		System.out.println("Long click Pressed...");
		state.longClick(this);
	}
	
	public void onClick() {
		System.out.println("Click Pressed...");
		state.click(this);
	}
}
