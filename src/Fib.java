//  Program Name  		:	Fib.java
//  Description   		:   Description
//						:
//						:
//                      :
//  Date               	:	3/26/2014
//  Software Developer 	:	Taylor Vories CS 2050
//  Remarks            	:
//
//


//TODO: Add special cases and limitations
public class Fib
{
	private int count;
	public int[] fibTable;

	public Fib()
	{
		count = 0;
		fibTable= new int[30];
	}

	public int recurFib(int n)
	{
		if (n < 0)
			return 0;
		count++;
		if (n == 0 || n == 1)
		{
			return n;
		}
		else
		{
			return recurFib(n-1) + recurFib((n-2));
		}
	}

	public int recurFibEnhanced(int n)
	{
		count++;
		if (n < 0)
			return 0;
		if (n == 0 || n == 1)
		{
			return n;
		}
		else if (fibTable[n-1] != 0)   //If calculation has already been done
		{
			System.out.println("Already in table!");
			return fibTable[n-1];
		}
		else
		{
			System.out.println("Not in table.");
			fibTable[n-1] = recurFibEnhanced(n-1) + recurFibEnhanced((n-2));
			return fibTable[n-1];
		}
	}
}
