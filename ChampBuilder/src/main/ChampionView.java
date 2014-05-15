package main;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class ChampionView extends JFrame {
	
	/**
	 * De view voor de app. Hierin staan alle knoppen en de JPane die de output
	 * van de champion toont.
	 */
	private static final long serialVersionUID = 1L;
	private JButton jaxbutton = new JButton("Jax");
	private JButton ryzebutton = new JButton("Ryze");
	
	private JButton roabutton = new JButton("RodOfAges");
	private JButton sfcbutton = new JButton("SunfireCape");
	
	private JButton buySkinbutton = new JButton("BuySkin!");
	
	public JTextPane champText = new JTextPane();
	
	ChampionView(){
		
		//Container panel
		JPanel containerPanel = new JPanel();
		containerPanel.setLayout(new GridLayout(2,1));
		
		//Inner container panel
		JPanel buttonContainer = new JPanel();
		buttonContainer.setLayout(new GridLayout(3,1));
		
		//New champion panel
		JPanel champPanel = new JPanel();
		champPanel.add(jaxbutton);
		champPanel.add(ryzebutton);
		
		//Item panel
		JPanel itemPanel = new JPanel();
		itemPanel.add(roabutton);
		itemPanel.add(sfcbutton);
		
		//Etc. panel
		JPanel etcPanel = new JPanel();
		etcPanel.add(buySkinbutton);
		
		//Add panels to button container
		buttonContainer.add(champPanel);
		buttonContainer.add(itemPanel);
		buttonContainer.add(etcPanel);
		
		//Text panel
		JPanel textPanel = new JPanel();
		champText.setPreferredSize(new Dimension(400,350));
		champText.setEditable(false);
		textPanel.add(champText);
		
		//Add to container panel
		containerPanel.add(buttonContainer);
		containerPanel.add(textPanel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,750);
		this.add(containerPanel);
		
	}
	
	/*
	 * Voeg de buttonlisteners toe aan de buttons zodat deze iets doen als er op geklikt wordt
	 */
	void addButtonListener(ActionListener listenForButton) {
		jaxbutton.addActionListener(listenForButton);
		ryzebutton.addActionListener(listenForButton);
		roabutton.addActionListener(listenForButton);
		sfcbutton.addActionListener(listenForButton);
		buySkinbutton.addActionListener(listenForButton);
	}
	
}
