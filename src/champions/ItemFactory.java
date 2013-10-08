package champions;

import champions.item.RodOfAges;
import champions.item.SunfireCape;

public class ItemFactory extends AbstractFactory{

	@Override
	Champion getChampion(String champion) {
		return null;
	}

	@Override
	Item getItem(String item) {
		if(item == null) {
			return null;
		}
		
		if(item.equalsIgnoreCase("RODOFAGES")) {
			return new RodOfAges();
		} else if (item.equalsIgnoreCase("SUNFIRECAPE")) {
			return new SunfireCape();
		}
		
		return null;
	}

}
