package diceGames;
/*
 * This program is part of my learning Java series
 * This one looks at classes within classes
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/09/java-16-classes-within-classes.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Sept 2016
 */
 


public class diceClass {

	//Attributes
	private int numSides;
	private int diceRollValue;
	
	//Constructors
	
	public diceClass(int sides)
	{
		System.out.println("CONSTRUCTOR called with sides of " + sides);
		this.numSides = sides;
	}
	
	public diceClass()
	{
		this(6);
	}
	
	//Methods

	
	public int rollDice ()
	{
		diceRollValue = 1 + (int)(Math.random() * numSides);
		
		System.out.println("Rolled the number " + diceRollValue);
		return this.diceRollValue;
	}
	
	
	public void setNumSides (int sides)
	{
		System.out.println("Set number of sides as " + sides);
		this.numSides = sides;
	}
	
	public int getDiceValue ()
	{
		return diceRollValue;
	}
	
	public int diceOnOrUnder (int threshold)
	{
		if (diceRollValue <= threshold)
			return 1;
		else
			return 0;
	}
	
	public int diceOnOrOver (int threshold)
	{
		if (diceRollValue >= threshold)
			return 1;
		else
			return 0;
	}
	
	public int diceEquals (int target)
	{
		if (diceRollValue == target)
			return 1;
		else
			return 0;
	}	
	

}
