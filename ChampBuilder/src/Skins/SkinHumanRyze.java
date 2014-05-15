package Skins;

import main.ChampionDecorator;
import champions.Champion;

public class SkinHumanRyze extends ChampionDecorator{

	Champion champ;
	public SkinHumanRyze(Champion champion) {
		super(champion);
		champ = champion;
		champ.setSkin("Human Ryze");
	}
}