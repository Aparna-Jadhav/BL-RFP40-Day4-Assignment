package Day4;

import java.util.Scanner;

public class SnakeLadder {

	public static void main(String[] args) 
	{
		// Current Position: UC1
		int currentPosition=0;		 
		int diceRoll = 0, option = 0;
		String playGame = "y"; 
        
		System.out.print ("Do you want to play the game? Y or N    :  ");
        
		Scanner input=new Scanner(System.in);
		    
		playGame = input.nextLine();
        System.out.print ("\n\n");
       
        while (playGame.equals ("y") || playGame.equals ("Y"))
        {
        	// UC4
        	if(currentPosition <0)
        	{
        		// Restart the game.
        		currentPosition = 0;
        		System.out.println("Restarting game");
        	}
        	
        	// UC4
        	if(currentPosition == 100)
    		{
        		System.out.println("You Won : ");
        		System.exit(0);        		
    		}
        	
        	// Dice roll : UC2
        	diceRoll = (int)(Math.random()*6 )+1 ; 
            System.out.println("Dice value: " + diceRoll);
        	
        	// select option randomly
        	option = (int)(Math.random()*3) ;
        	        	
        	// Option : UC3
        	switch(option)
        	{
        	// No Play
        	case  0:
        		// UC6
        		System.out.println("No Play : Current Position : " + currentPosition);
        		break;
        		
        	// ladder
        	case 1:
        		// Add only if less than or equal to 100 : UC5
        		if(currentPosition+diceRoll <= 100)
        		{	
	        		currentPosition+=diceRoll;
	        		
	        		// UC6
	        		System.out.println("Ladder : Current Position : " + currentPosition);
        		}        		
        		
        		break;
        		
        	// Snake	
        	case 2:
        		currentPosition-=diceRoll;
        		// UC6
        		System.out.println("Snake : Current Position : " + currentPosition);
        		break;
        	}
        }
        
        System.out.println ("Thank You for playing game.");
	        
	        
	    } //end main method
	}


