package org.troel.iterator.tvChannel;

public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.searchAvaiableChannels();

		for(int i = 1; i < 30; i++) {
			tv.accessChannel(i);
		}
	}
}
