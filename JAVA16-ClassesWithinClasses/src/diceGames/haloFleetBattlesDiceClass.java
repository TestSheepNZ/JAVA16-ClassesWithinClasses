package diceGames;

/*
 * This program is part of my learning Java series
 * This one looks at inheritance
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/09/java-15-inheritance.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Sept 2016
 */

public class haloFleetBattlesDiceClass extends diceClass {

	// Attributes
	private String diceResult;
	
	// Constructor
	public haloFleetBattlesDiceClass ()
	{
		//Super calls the base class constructor
		super(6);
		System.out.println("HALO CLASS: CONSTRUCTOR called");
	}

	// Methods
	public String rollHaloDice ()
	{
		/*
		 * Because I don't have a rollDice method 
		 * within haloFleetBattlesDiceClass, this
		 * method is not overloaded
		 * 
		 * Hence I don't need to use super.rollDice
		 */
		int diceVal = rollDice();
		
		switch (diceVal)
		{
			case 1:
				diceResult = "Skull";
				break;
			case 2:
			case 3:
				diceResult = "N/A";
				break;
			case 4:
			case 5:
				diceResult = "One hit";
				break;
			default:
				diceResult = "Two hits";
		}
		
		System.out.println("HALO CLASS: Dice value is " + diceResult);
		
		return diceResult;
	}
	
	public String getDiceResult()
	{
		return diceResult;
	}
	
	
	public int getDiceValue ()
	{
		int diceVal;
		
		//super.getDiceValue calls getDiceValue for parent class
		diceVal = super.getDiceValue();

		switch (diceVal)
		{
			case 4:
			case 5:
				return 1;
			case 6:
				return 2;
			default:
				return 0;
		}
	}
	
}
