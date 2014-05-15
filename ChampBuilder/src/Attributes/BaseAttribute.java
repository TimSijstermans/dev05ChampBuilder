package Attributes;

public class BaseAttribute {
	private int _baseValue;
	private double _baseMultiplier;
	
	public BaseAttribute(int value, double multiplier)
	{
		_baseValue = value;
		_baseMultiplier = multiplier;
	}	
	public int getBaseValue()
	{
		return _baseValue;
	}
	public double getBaseMultiplier()
	{
		return _baseMultiplier;
	}
}
