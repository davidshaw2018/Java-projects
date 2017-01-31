package lab2;

import cse131.ArgsProcessor;

public class Nim {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int turns = ap.nextInt("Would you like to go first or second?");
		int numSticks = ap.nextInt("How many sticks do you start with?");
		int c = numSticks;
		int round = 0;
		
		if (turns == 1) {
			
			while (c > 0) 
			{int humTurn = ap.nextInt("How many sticks will you take away?");
			
				if (humTurn != 1) {humTurn = 2;}
				if (c == 1) {humTurn = 1;}
				System.out.println("Round " + round + ": There are " + c + 
						" sticks. You take " + humTurn + ". There are " + (c - humTurn) + " sticks left.");
			c = c - humTurn;
			
			round = round + 1;
				if (c == 0) {System.out.println("You win!");}
				else {int compTurn =  (int) Math.round(1 + Math.random());
				System.out.println("Round " + round + ": There are " + c + 
						" sticks. The computer takes " + compTurn + ". There are " + (c - compTurn) + " sticks left.");
			
			if (c == 1) {compTurn = 1;}
			c = c - compTurn;
			round = round + 1;
			if (c == 0) {System.out.println("The computer wins.");}}
			}}
			
		
		
		else {
			
			while (c > 0) 
			{int compTurn =  (int) Math.round(1 + Math.random());
			
			System.out.println("Round " + round + ": There are " + c + 
					" sticks. The computer takes " + compTurn + ". There are " + (c - compTurn) + " sticks left.");
			c = c - compTurn;
			round = round + 1;
			if (c == 0) {System.out.println("The computer wins.");}
				
				else {int humTurn = ap.nextInt("How many sticks will you take away?");
				if (humTurn != 1) {humTurn = 2;}
				if (c == 1) {humTurn = 1;}
				System.out.println("Round " + round + ": There are " + c + 
						" sticks. You take " + humTurn + ". There are " + (c - humTurn) + " sticks left.");
			c = c - humTurn;
			round = round + 1;
			if (c == 0) {System.out.println("You win!");}}
			}}
	
		
		
			
			
			
		}
		

	}


