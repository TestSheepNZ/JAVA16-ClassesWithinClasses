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

import java.util.ArrayList;
import java.util.List;

public class DiceGroupClass {
	
	// Attributes
	private List<DiceClass> diceList;

	// Constructors
	public DiceGroupClass ()
	{
		this(2);
	}
	
	public DiceGroupClass (int num)
	{
		System.out.println("GROUP CONSTRUCTOR Called with " + num + " dice");
		diceList = new ArrayList<DiceClass>();
		setNumDice(num);
		System.out.println("GROUP CONSTRUCTOR Number dice set to " + diceList.size() );
	}
	
	//Methods
	public void setNumDice (int size)
	{
		
		// Add any dice needed
		while ( diceList.size() < size )
		{
			DiceClass newDice = new DiceClass();
			diceList.add(0, newDice);
		}
		
		//Remove any excess
		while ( diceList.size() < size )
		{
			diceList.remove(0);
		}
	}
	
	public void rollAllDice ()
	{
		System.out.println("ROLL DICE - I have " + diceList.size() + " dice");	
		for(DiceClass thisDice:diceList)
		{
			thisDice.rollDice();
		}
	}
	
	public int sumAllDice ()
	{
		int total = 0;
		
		rollAllDice();
		
		for(DiceClass thisDice:diceList)
		{
			total += thisDice.getDiceValue();
		}
		
		System.out.println("Dice total " + total);
		return total;
	}
	
	public int getDiceOverThreshold (int threshold)
	{
		int total = 0;
		
		rollAllDice();
		
		for(DiceClass thisDice:diceList)
		{
			// If dice roll on or over returns true
			// Increment total by 1
			if (thisDice.diceOnOrOver(threshold))
			{
				total++;
			}
		}
		System.out.println("Threhold " + total 
				+ " out of " + diceList.size()
				+ " rolled above " + threshold);
		return total;
	}
	
}
