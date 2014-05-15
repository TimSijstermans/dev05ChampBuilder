package main;

import champions.Champion;

public abstract class ChampionDecorator extends Champion {
	
	public Champion character;
	
	public ChampionDecorator(Champion champion) {
		this.character = champion;
	}
}
