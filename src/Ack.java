//  Program Name  		:	Ack.java
//  Description   		:   Description
//						:
//						:
//                      :
//  Date               	:	3/26/2014
//  Software Developer 	:	Taylor Vories CS 2050
//  Remarks            	:
//
//

//TODO: Add special cases to prevent stack overflow
public class Ack
{
	private final int COLUMN = 101;
	private final int ROW = 5;
	private int count, outOfBounds, yMax;
	public int[][] ackTable;

	public Ack()
	{
		count = 0;
		outOfBounds = 0;
		yMax = 0;
		ackTable = new int[ROW][COLUMN];
	}

	public int recursAck(int x, int y) //TODO: Fix StackOverflow
	{
		count++;
		if (x == 0)
		{
			return y + 1;
		}
		else if (y == 0)
		{
			return recursAck(x -1, 1);
		}
		else
		{
			if (y <= 100)
			{
				if (ackTable[x][y] != 0)    //If calculation has already been done
				{
					System.out.println("Already in the table!");
					return ackTable[x][y];
				}
				else
				{
					System.out.println("Not in table.");
					ackTable[x][y] = recursAck(x-1, recursAck(x, y-1));
					return ackTable[x][y];
				}
			}
			System.out.println("Outside of y max value.");
			if (y > yMax)
				yMax = y;
			outOfBounds++;
			return recursAck(x-1, recursAck(x, y-1));
		}
	}

	public int getCount()
	{
		return count;
	}

	public int getyMax()
	{
		return yMax;
	}

	public int getOutOfBounds()
	{
		return outOfBounds;
	}
}
