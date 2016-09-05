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

public class diceGroupClass {
	
	// Attributes
	private ArrayList<diceClass> diceList;

	// Constructors
	public diceGroupClass ()
	{
		this(2);
	}
	
	public diceGroupClass (int num)
	{
		System.out.println("GROUP CONSTRUCTOR Called with " + num + " dice");
		diceList = new ArrayList<diceClass>();
		setNumDice(num);
		System.out.println("GROUP CONSTRUCTOR Number dice set to " + diceList.size() );
	}
	
	//Methods
	public void setNumDice (int size)
	{
		
		// Add any dice needed
		while ( diceList.size() < size )
		{
			diceClass newDice = new diceClass();
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
		for(diceClass thisDice:diceList)
		{
			thisDice.rollDice();
		}
	}
	
	public int sumAllDice ()
	{
		int total = 0;
		
		rollAllDice();
		
		for(diceClass thisDice:diceList)
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
		
		for(diceClass thisDice:diceList)
		{
			total += thisDice.diceOnOrOver(threshold);
		}
		System.out.println("Threhold " + total 
				+ " out of " + diceList.size()
				+ " rolled above " + threshold);
		return total;
	}
	
}
