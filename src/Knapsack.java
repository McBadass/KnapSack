//  Program Name  		:	Knapsack.java
//  Description   		:   Description
//						:
//						:
//                      :
//  Date               	:	3/10/14
//  Software Developer 	:	Taylor Vories CS 2050
//  Remarks            	:
//
//

import java.util.ArrayList;

public class Knapsack
{
	private int size;
	private ArrayList<KnapsackItem> knapArr;
	private int value;
	private int numItems;

	/**
	 * Default constructor.
	 */
	public Knapsack()
	{
		this.size = 0;
		knapArr = new ArrayList<KnapsackItem>();
		value = 0;
		numItems = 0;
	}
	/**
	 * Constructor.
	 * @param size The "size" of the knapsack.
	 */
	public Knapsack(int size)
	{
		this.size = size;
		knapArr = new ArrayList<KnapsackItem>();
		value = 0;
		numItems = 0;
	}

	/**
	 * Constructor with item array.
	 * @param itemArray Array of items to add to knapsack.
	 */
	public Knapsack(KnapsackItem[] itemArray)
	{
		for (int i = 0; i < itemArray.length; i++)
		{
			addItem(itemArray[i]);
		}
	}

	public void addItem(KnapsackItem itemToAdd)
	{
		numItems++;
		value += itemToAdd.getValue();
		size += itemToAdd.getSize();
		knapArr.add(itemToAdd);
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public int getSize()
	{
		return size;
	}

	public int getValue()
	{
		return value;
	}
}
