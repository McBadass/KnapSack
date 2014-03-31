//  Program Name  		:	Menu.java
//  Description   		:   Description
//						:
//						:
//                      :
//  Date               	:	3/30/2014
//  Software Developer 	:	Taylor Vories CS 2050
//  Remarks            	:
//
//

import java.util.Scanner;

public class Menu
{
	private final int MAX_FIB_AUTO = 30;    //Max number for auto fib program.

	// Menu text ----------------------------------------------------
	private final String welcome = "Welcome to Project 4.  Please make a choice below.";
	private final String horizontalLine = "-------------------------------------------------------";
	private final String makeSelectionChoice = "Please make your selection: ";
	private final String chooseFromMenu = "Please make a choice from the following menu:";
	private final String notValidEntry = "Not a valid entry.  Try again";
	private final String chooseKnapsack = "Knapsack program.";
	private final String chooseFib = "Fibonacci program.";
	private final String chooseAck = "Ackermann program.";
	private final String chooseExit = "Exit the program.";
	private final String mFibAuto = "Automatically calculate fibonacci from 0 to " + MAX_FIB_AUTO + ".";
	private final String mFibManual = "Choose your own numbers to calculate with fibonacci.";
	private final String mPrevious = "Go back to the previous menu.";
	// end Menu text ------------------------------------------------

	// Return options for user input --------------------------------
	private final int returnString = 0;
	private final int returnInt = 1;
	private final int returnBool = 2;
	private final int returnMenu = 3;
	private final int returnKnap = 4;
	private final int returnFib = 5;
	private final int returnAck = 6;
	// end return options for user input ----------------------------

	// Prompt types for user input ----------------------------------
	private final int menuPrompt = 0;
	private final int endPrompt = 1;
	// end Prompt types for user input ------------------------------

	String userChoice;  //Temporarily holds user choice

	/**
	 * Default constructor
	 */
	public Menu()
	{

	}

	/**
	 * The main menu welcomes the user and asks for user input to
	 * determine what to do.
	 */
	public void mainMenu()

	{
		System.out.println(horizontalLine);
		System.out.println(welcome);
		System.out.println(horizontalLine);
		System.out.println();

		do
		{
			//Print options to the console
			System.out.println("1. " + chooseKnapsack);
			System.out.println("2. " + chooseFib);
			System.out.println("3. " + chooseAck);
			System.out.println("4. " + chooseExit);

			userChoice = getUserChoice(menuPrompt, 4, returnMenu);

			switch (Integer.parseInt(userChoice))
			{
				case 1: //Knapsack
				{
					knapMenu();
					break;
				}
				case 2: //Fibonacci
				{
					fibMenu();
					break;
				}
				case 3: //Ackermann
				{
					ackMenu();
					break;
				}
				case 4: //Exit
				{
					exitProgram();
				}
			}
		}while(1 > 0);  //Loop until user selects exit.
	}

	/**
	 * Menu for the Knapsack sub-program
	 */
	public void knapMenu()
	{
		System.out.println("Welcome to the Knapsack Sub-Program.");
		//TODO: add knapsack options
		//TODO: add test cases?
	}

	/**
	 * Menu for the Fibonacci sub-program.
	 */
	public void fibMenu()
	{
		boolean bProceed = false;   //Flag
		do
		{
			System.out.println("Welcome to the Fibonacci Sub-Program.");
			//TODO: add fib options
			System.out.println(chooseFromMenu);
			System.out.println("1. " + mFibAuto);
			System.out.println("2. " + mFibManual);
			System.out.println("3. " + mPrevious);

			userChoice = getUserChoice(menuPrompt, 3, returnMenu);
			switch (Integer.parseInt(userChoice))
			{
				case 1:
				{
					fibAuto();
					break;
				}
				case 2:
				{
					break;
				}
				case 3:
				{
					bProceed = true;
					break;
				}
			}
		}while(!bProceed);

	}

	private void fibAuto()
	{
		//TODO: Write auto fib from 1-30.
	}

	/**
	 * Menu for the Ackermann sub-program.
	 */
	public void ackMenu()
	{
		System.out.println("Welcome to the Ackermann Sub-Program.");
		//TODO: add ack options
	}

	private void exitProgram()
	{
		System.exit(0);
	}

	/**
	 * Uses the Scanner class to get user choice based on multiple prompts.
	 * @return userChoice
	 */
	public String getUserChoice(int promptType, int numChoices, int typeOfReturn)
	{
		Scanner skb = new Scanner(System.in);
		String userInput;
		boolean exitLoop = false;

		do
		{
			switch (promptType)
			{
				case menuPrompt:
				{
					System.out.print("\n" + makeSelectionChoice);
					break;
				}
				case endPrompt:
				{
					System.out.print(": ");
					break;
				}
			}

			userInput = skb.nextLine();

			switch (typeOfReturn)
			{
				case returnString:
				{
					userInput.trim();
					exitLoop = true;
					break;
				} // end returnString case
				case returnInt:
				{
					try
					{
						int tempInt = Integer.parseInt(userInput);

						if (tempInt < 0) //doesn't allow negative numbers
							System.out.print(notValidEntry);
						else
							exitLoop = true;
					}
					catch (NumberFormatException e)
					{
						System.out.print(notValidEntry);
					}
					break;
				} // end returnInt case
				case returnBool:
				{
					if (userInput.trim().equalsIgnoreCase("y") || userInput.trim().equalsIgnoreCase("true") || userInput.trim().equalsIgnoreCase("yes"))
					{
						userInput = "true";
						exitLoop = true;
					}
					else if(userInput.trim().equalsIgnoreCase("n") || userInput.trim().equalsIgnoreCase("no") || userInput.trim().equalsIgnoreCase("false"))
					{
						userInput = "false";
						exitLoop = true;
					}
					else
					{
						System.out.print(notValidEntry);
					}
					break;
				} // end returnBool case
				case returnMenu:
				{
					try
					{
						int tempChoice = Integer.parseInt(userInput);

						if (tempChoice > 0 && tempChoice <= numChoices)
						{
							exitLoop = true;
						}
						else
						{
							System.out.print(notValidEntry);
						}
					}
					catch (NumberFormatException e)
					{
						System.out.print(notValidEntry);
					}
					break;
				} // end returnMenu case
			}
		}while (!exitLoop); //end do-while loop

		return userInput;
	} // end getUserChoice
}
