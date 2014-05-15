package main;

import champions.Champion;

public abstract class CharacterFactory {
	
	public abstract Champion getChampion(String type);
	
}
