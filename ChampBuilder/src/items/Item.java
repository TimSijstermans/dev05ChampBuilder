package items;

import Attributes.RawBonus;

/*
 * De overhead item klasse.
 * In deze klasse staan alle functies om voor de stats van de champion aan te passen via t item.
 */
public abstract class Item {

	private String name;
	RawBonus bonusHp = new RawBonus(0,0);
	RawBonus bonusMp = new RawBonus(0,0);
	RawBonus bonusAp = new RawBonus(0,0);
	RawBonus bonusAd = new RawBonus(0,0);
	RawBonus bonusArmor = new RawBonus(0,0);
	RawBonus bonusMr = new RawBonus(0,0);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBonusHp(int flat, double multiplier){
		bonusHp = new RawBonus(flat, multiplier);
	}
	public RawBonus getBonusHp(){
		return bonusHp;
	}
	
	public void setBonusMp(int flat, double multiplier){
		bonusMp = new RawBonus(flat, multiplier);
	}
	public RawBonus getBonusMp() {
		return bonusMp;
	}
	
	public void setBonusAp(int flat, double multiplier){
		bonusAp = new RawBonus(flat, multiplier);
	}
	public RawBonus getBonusAp() {
		return bonusAp;
	}
	
	public void setBonusAd(int flat, double multiplier){
		bonusAd = new RawBonus(flat, multiplier);
	}
	public RawBonus getBonusAd(){
		return bonusAd;
	}
	
	public void setBonusArmor(int flat, double multiplier){
		bonusArmor = new RawBonus(flat, multiplier);
	}
	public RawBonus getBonusArmor() {
		return bonusArmor;
	}
	
	public void setBonusMr(int flat, double multiplier){
		bonusHp = new RawBonus(flat, multiplier);
	}
	public RawBonus getBonusMr() {
		return bonusMr;
	}	
}
