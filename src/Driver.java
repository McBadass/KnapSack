//  Program Name  		:	Driver.java
//  Description   		:   Description
//						:
//						:
//                      :
//  Date               	:	3/26/2014
//  Software Developer 	:	Taylor Vories CS 2050
//  Remarks            	:
//
//

import java.io.*;
import java.util.Scanner;

public class Driver
{
	public static void main(String[] args)
	{
		// Return options for user input --------------------------------
		final int returnString = 0;
		final int returnInt = 1;
		final int returnBool = 2;
		final int returnMenu = 3;
		final int returnPoly = 4;
		// end return options for user input ----------------------------

		// Prompt types for user input ------------------------------
		final int menuPrompt = 0;
		final int endPrompt = 1;
		// End prompt types for user input --------------------------

		Menu menu = new Menu();
		menu.mainMenu();

		Scanner kb = new Scanner(System.in);
		int testFib;
		Fib test1 = new Fib();
		Ack test2 = new Ack();
		int ack1, ack2;
		System.out.println("Welcome.");
		do
		{

			//System.out.print("Number to test with?  30 or less: ");
			//testFib = kb.nextInt();

//			System.out.println("Using " + testFib + " as fib testing.");
//
//			System.out.println("Raw recursion: " + test1.recurFib(testFib));
//			System.out.println("Enhanced recursion: " + test1.recurFibEnhanced(testFib));

			System.out.print("Number 1 to test Ack.  4 or less: ");
			ack1 = kb.nextInt();
			if (ack1 == -1)
				break;
			System.out.print("Number 2 to test Ack.  15 or less: ");
			ack2 = kb.nextInt();


			System.out.println(test2.recursAck(ack1, ack2));
			System.out.println("Count: " + test2.getCount());
			System.out.println("Y Max: " + test2.getyMax());
			System.out.println("Times it went out of bounds: " + test2.getOutOfBounds());
		}while (ack1 != -1);
	}

	/** ----------------------------------------------------------
			* createFile uses PrintWriter, BufferedWriter, and FileWriter to
	* properly create a file, with error handling, and return a PrintWriter
	* object that can be printed to.
		* @param fileName Filename of the file to be created.
		* @return PrintWriter - object to be manipulated and then saved.
	*/
	private PrintWriter createFile(String fileName){

		try
		{
			// Creates a File object that allows you to work with files on the hard drive
			File fileToWrite = new File(fileName);


			// FileWriter is used to write streams of characters to a file
			// BufferedWriter gathers a bunch of characters and then writes
			// them all at one time (Speeds up the Program)
			// PrintWriter is used to write characters to the console, file
			PrintWriter infoToWrite = new PrintWriter(new BufferedWriter(
					new FileWriter(fileToWrite)));

			return infoToWrite;

		}
		// Catch if file is unable to create.
		catch(IOException e)
		{

			System.out.println("An I/O Error Occurred");

			// Closes the program
			System.exit(0);
			return null;
		}

	} // end createFile ------------------------------------------
}
