package main;

import items.ItemROA;
import items.ItemSFC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Skins.SkinAnglerJax;
import Skins.SkinHumanRyze;
import champions.Champion;

/*
 * De champion controller. Hier worden alle belangrijke model onderdelen vanuit de champion naar de view geladen.
 */
public class ChampionController {
	
	private ChampionView champView;
		
	AbstractFactory abstractFactory = new AbstractFactory(); //Start de abstract factory
	CharacterFactory characterFactory = abstractFactory.getCharacterFactory("CHAMPION"); //Vanuit de abstract factory, laad de champion factory
	
	public ChampionController(ChampionView champView) {
		this.champView = champView;
		this.champView.addButtonListener(new ButtonListener());
	}
	
	/*
	 * De buttonlistener, deze vangt alle kliks van de knoppen op.
	 */
	class ButtonListener implements ActionListener{
		
		Champion champion = null;
		
		/*
		 * Vang de klik op.
		 */
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			
			//Als de button Jax of Ryze is aangeklikt, vul champion met de champion.
			if(cmd == "Jax" || cmd == "Ryze") {
				champion = characterFactory.getChampion(cmd);
			}
			
			//Als er een champion bestaat, en er op een item is geklikt voeg een item toe aan de champion.
			if(champion != null && cmd == "RodOfAges") {
				champion.addItem(new ItemROA());
			} else if(champion == null && cmd == "RodOfAges") {
				//Als er nog geen champion is, moet de gebruiker eerst een champion aanklikken.
				champView.champText.setText("Choose a champion first!");
			}
			
			//Zelfde als voor de RodOfAges alleen dan SunfireCape
			if(champion != null && cmd == "SunfireCape") {
				champion.addItem(new ItemSFC());
			} else if(champion == null && cmd == "SunfireCape") {
				champView.champText.setText("Choose a champion first!");
			}
			
			if(champion != null && cmd =="BuySkin!") {
				// Als de champion Jax is, voeg met de BuySkin! knop de SkinAnglerJax toe aan de champion.
				if(champion.getName() == "Jax")	{
					SkinAnglerJax schampion =  new SkinAnglerJax(champion);
				}
				//Als de champion Ryze is, voeg met de BuySkin! knop de SkinHumanRyze toe aan de champion.
				if(champion.getName()== "Ryze")	{
					SkinHumanRyze schampion = new SkinHumanRyze(champion);
				}
				
			}
			
			if(champion != null) {
				// Na alles gedaan te hebben, laat in het JPane de stats en de skin zien van de champion.
				// Als er een item is toegevoegd word deze ook getoond.
				String summary = champion.getSummary();
				champView.champText.setText(summary);
			}
		}
	}	
}
