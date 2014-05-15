package Skins;

import main.ChampionDecorator;
import champions.Champion;

public class SkinAnglerJax extends ChampionDecorator{

	Champion champ;
	public SkinAnglerJax(Champion champion) {
		super(champion);
		champ = champion;
		champ.setSkin("Angler Jax");
	}

//	@Override
//	public String getSummary() {
////		String push = "";
////		push += "You picked Jax";
////		push += "\n\""+champ.taunt()+"\"";
////		push += "\n\nMy current stats are:";
////		
////		push += "\nHP: "+ champ.hp.finalValue();
////		push += "\nMP: "+ champ.mp.finalValue();
////		push += "\nAD: "+ champ.ad.finalValue();
////		push += "\nAP: "+ champ.ap.finalValue();
////		push += "\nArmor: "+ champ.armor.finalValue();
////		push += "\nMR: "+ champ.mr.finalValue();
////		
////		push += "\n\nMy inventory: \n(slots used: "+champ.equipped.size()+"/6)";
////		for (String str : champ.equipped)
////		{
////			push += "\n"+ str;
////		}
////		return push;
//		return null;
//	}
}
