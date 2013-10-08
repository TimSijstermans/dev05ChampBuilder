package champions;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String coice) {
		if(coice.equalsIgnoreCase("CHAMPION")) {
			return new ChampionFactory();
		} else if (coice.equalsIgnoreCase("ITEM")) {
			return new ItemFactory();
		}
		return null;
		
	}
	
}
