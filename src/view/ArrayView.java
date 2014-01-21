package view;

import candy.model.MarshmallowCreature;

public class ArrayView
{

	public void printIntInformation(int [][] currentArray)
	{
		System.out.println("foreach printing");
		for(int [] currentRow : currentArray)
		{
			for(int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
			
		System.out.println("for printing");
		for (int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void printStringInformation(String [][] currentArray)
	{
		System.out.println("foreach printing");
		for(String [] currentRow : currentArray)
		{
			for(String currentString : currentRow)
			{
				System.out.print(currentString + "\t");
			}
			System.out.println();
		}
			
		System.out.println("for printing");
		for (int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void printCreatureInformation(MarshmallowCreature [][] currentArray)
	{
		System.out.println("foreach printing");
		for(MarshmallowCreature [] currentRow : currentArray)
		{
			for(MarshmallowCreature currentCreature : currentRow)
			{
				System.out.print(currentCreature.getName()+" "+currentCreature.getArms()+"Arms "+currentCreature.getEyes()+"eyes "+currentCreature.getLegs()+"legs "+ currentCreature.getButton()+"\t");
			}
			System.out.println();
		}
			
		System.out.println("for printing");
		for (int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col].getName()+" "+currentArray[row][col].getArms()+"Arms "+currentArray[row][col].getEyes()+"eyes "+currentArray[row][col].getLegs()+"legs "+ currentArray[row][col].getButton()+"\t");
			}
			System.out.println();
		}
		
	}
}
