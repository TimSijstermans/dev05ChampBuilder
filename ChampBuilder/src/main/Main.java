package main;

/*
 * Main class.
 * Hier worden de view en de controller geladen. Daarna word het frame getoond.
 */
public class Main {
	
	public static void main(String[] args) {
		
		ChampionView champView = new ChampionView();
				
		ChampionController champController = new ChampionController(champView);
		
		champView.setVisible(true);
		
	}
	
}
