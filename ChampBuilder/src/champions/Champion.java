package champions;

import items.Item;

import java.util.ArrayList;

public abstract class Champion implements CharacterInterface  {
	//Initieel heeft de champion geen skin. Dus zet deze naar "Default"
	String currSkin = "Default";
	
	//Verkrijg de beschrijving van de champion
	public String getSummary() {return "";}
	//Elke champion heeft een taunt.
	public String taunt() { return "";}
	//Als er items aan een champion worden toegevoegd worden deze verkregen via de getItems() 
	public ArrayList<String> getItems() { return null; }
	//Voeg een nieuw item toe aan de champion
	public void addItem(Item input) {}
	//Verkrijg de skin die de champion heeft. Initieel is dit de Default skin.
	public String getSkin(){return currSkin;}
	//Geef de champion een skin
	public void setSkin(String input){this.currSkin = input;}
	//Verkrijg de naam van de champion
	public String getName() { return this.getName(); }	
}