package champions;

import champions.champion.Jax;
import champions.champion.Ryze;

public class ChampionFactory extends AbstractFactory{

	@Override
	public Champion getChampion(String champion) {
		if(champion == null) {
			return null;
		}
		
		if(champion.equalsIgnoreCase("JAX")) {
			return new Jax();
		} else if(champion.equalsIgnoreCase("RYZE")) {
			return new Ryze();
		}
		
		return null;
	}

	@Override
	Item getItem(String item) {
		// TODO Auto-generated method stub
		return null;
	}

}
