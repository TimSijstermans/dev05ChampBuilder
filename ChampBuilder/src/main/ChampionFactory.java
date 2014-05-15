package main;

import champions.Champion;
import champions.Jax;
import champions.Ryze;

public class ChampionFactory extends CharacterFactory {
	
	@Override
	public Champion getChampion(String type){
		if("Jax".equals(type)) {
			return new Jax();
		}
		if("Ryze".equals(type)) {
			return new Ryze();
		}
		return null;
	}
	
}
