package champions;

import items.Item;

import java.util.ArrayList;

import Attributes.Attribute;

public class Jax extends Champion {

	Attribute hp = new Attribute(463);
	Attribute mp = new Attribute(230);
	Attribute ap = new Attribute(0);
	Attribute ad = new Attribute(56);
	Attribute armor = new Attribute(18);
	Attribute mr = new Attribute(30);
	
	ArrayList<String> equipped = new ArrayList<String>();
	
	@Override
	public String getSummary() {
		String push = "";
		push += "You picked "+this.getName()+ " with the "+this.getSkin()+" skin";
		push += "\n\""+this.taunt()+"\"";
		push += "\n\nMy current stats are:";
		
		push += "\nHP: "+ hp.finalValue();
		push += "\nMP: "+ mp.finalValue();
		push += "\nAD: "+ ad.finalValue();
		push += "\nAP: "+ ap.finalValue();
		push += "\nArmor: "+ armor.finalValue();
		push += "\nMR: "+ mr.finalValue();
		
		push += "\n\nMy inventory: \n(slots used: "+equipped.size()+"/6)";
		for (String str : equipped)
		{
			push += "\n"+ str;
		}
		return push;
	}
	
	@Override
	public String taunt() {
		return "Who wants a piece of the champ?!";
	}
	@Override
	public String getName() {
		return "Jax";
	}
	 	
	@Override 
	public void addItem(Item input){
		if (equipped.size() <6)
		{
			equipped.add(input.getName());
			hp.addRawBonus(input.getBonusHp());
			mp.addRawBonus(input.getBonusMp());
			ap.addRawBonus(input.getBonusAp());
			ad.addRawBonus(input.getBonusAd());
			armor.addRawBonus(input.getBonusArmor());
			mr.addRawBonus(input.getBonusMr());		
		}
	}
	
	@Override
	public ArrayList<String> getItems() {
		return equipped;
	}
}
