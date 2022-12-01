package org.troel.state.headphone.states;

import org.troel.state.headphone.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
