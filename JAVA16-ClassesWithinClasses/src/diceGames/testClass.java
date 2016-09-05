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

import org.junit.Test;
import static org.junit.Assert.*;
 
import java.util.ArrayList;
import java.util.Arrays;

public class testClass {
	
	@Test
	public void testCraps()
	{
		System.out.println("ROLL TWO DICE");
		System.out.println("=============");
		diceGroupClass cupOfDice = new diceGroupClass();
		
		cupOfDice.sumAllDice();		
	}
	
	@Test
	public void testSpaceMarinesShooting()
	{
		/*
		 * I have 10 space marines
		 * they hit on 3+
		 * Those that hit, wound on a 4+
		 */
		System.out.println("WARHAMMER 40K SPACE MARINE");
		System.out.println("==========================");
		
		diceGroupClass cupOfDice = new diceGroupClass(10);
		int numHit = cupOfDice.getDiceOverThreshold(3);
		System.out.println("Caused " + numHit + " hits");
		
		cupOfDice.setNumDice(numHit);
		int numWounds = cupOfDice.getDiceOverThreshold(4);
		System.out.println("Caused " + numWounds + " wounds");		
	}
}
