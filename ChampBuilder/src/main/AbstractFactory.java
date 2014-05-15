package main;

public class AbstractFactory {
	
	public CharacterFactory getCharacterFactory(String type) {
		
		// New Factory's can be added, but for now; only add the ChampionFactory.
		return new ChampionFactory();
		
	}
	
}
