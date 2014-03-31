//  Program Name  		:	KnapsackItem.java
//  Description   		:   Description
//						:
//						:
//                      :
//  Date               	:	3/10/14
//  Software Developer 	:	Taylor Vories CS 2050
//  Remarks            	:
//
//

public class KnapsackItem
{
	private String name;
	private int size;
	private int value;


	public KnapsackItem(String name, int size, int value)
	{
		this.name = name;
		this.size = size;
		this.value = value;
	}

	public String getName()
	{
		return name;
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
