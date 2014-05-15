package Attributes;

import java.util.ArrayList;


public class Attribute extends BaseAttribute {
	
	private ArrayList<RawBonus> _rawBonuses = new ArrayList<RawBonus>();
	private ArrayList<FinalBonus> _finalBonuses = new ArrayList<FinalBonus>();;
	private int _finalValue;
	
	public Attribute(int startingValue) {
		super(startingValue, 0);
		
		_finalValue = getBaseValue(); 
	}
	
	public void addRawBonus(RawBonus bonus)
	{
		_rawBonuses.add(bonus);
	}
	public void addFinalBonus(FinalBonus bonus)
	{
		_finalBonuses.add(bonus);
	}
	public void removeRawBonus(RawBonus bonus)
	{
		if (_rawBonuses.indexOf(bonus) >=0)
		{
			_rawBonuses.remove(_rawBonuses.indexOf(bonus));
		}
	}
	public void removeFinalBonus(FinalBonus bonus)
	{
		if (_finalBonuses.indexOf(bonus) >=0)
		{
			_finalBonuses.remove(_finalBonuses.indexOf(bonus));
		}
	}
	
	public int calculateValue()
	{
		_finalValue = getBaseValue();
		
		int rawBonusValue = 0;
		double rawBonusMultiplier =0;
         
        for (RawBonus bonus : _rawBonuses)
        {
            rawBonusValue += bonus.getBaseValue();
            rawBonusMultiplier += bonus.getBaseMultiplier();
        }
         
        _finalValue += rawBonusValue;
        _finalValue *= (1 + rawBonusMultiplier);
         
        // Adding value from final
        int finalBonusValue = 0;
        double finalBonusMultiplier = 0;
         
        for (FinalBonus bonus : _finalBonuses)
        {
            finalBonusValue += bonus.getBaseValue();
            finalBonusMultiplier += bonus.getBaseMultiplier();
        }
         
        _finalValue += finalBonusValue;
        _finalValue *= (1 + finalBonusMultiplier);
         
        return _finalValue;
	}
	public int finalValue()
	{
		return calculateValue();
	}
	
}


