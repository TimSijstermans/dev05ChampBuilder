package champions;


public class Main {

	public static void main(String[] arg) {
		   
		AbstractFactory championFactory = FactoryProducer.getFactory("CHAMPION");
		
		Champion ryze = championFactory.getChampion("RYZE");
		ryze.showStats();
		
		
		
		AbstractFactory itemFactory = FactoryProducer.getFactory("ITEM");
		
		Item roa = itemFactory.getItem("RODOFAGES");
		roa.showItem();
		
		
		
	}
	
		
}
