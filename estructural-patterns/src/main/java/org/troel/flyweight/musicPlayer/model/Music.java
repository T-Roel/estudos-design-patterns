package org.troel.flyweight.musicPlayer.model;

import org.troel.flyweight.musicPlayer.musicFlyweight.MusicFlyweight;

public class Music {
	private MusicFlyweight musicFlyweight;
	private Integer playerQty;
	
	public Music(MusicFlyweight musicFlyweight) {
		this.musicFlyweight = musicFlyweight;
		this.playerQty = 0;
	}
	
	public void listenning() {
		playerQty++;
	}

	public MusicFlyweight getMusicFlyweight() {
		return musicFlyweight;
	}

	public void setMusicFlyweight(MusicFlyweight musicFlyweight) {
		this.musicFlyweight = musicFlyweight;
	}

	public Integer getPlayerQty() {
		return playerQty;
	}

	public void setPlayerQty(Integer playerQty) {
		this.playerQty = playerQty;
	}
	
	@Override
	public String toString() {
		return "Music [name=" + musicFlyweight.getName() + ", artist=" + musicFlyweight.getArtist() + 
				", durationInSeconds=" + musicFlyweight.getDurationInSeconds() + ", playerQty=" + playerQty + "]";
	}
}
