package controller;

import candy.model.MarshmallowCreature;
import view.ArrayView;

public class Controller
{

	private String[][] names;
	private int[][] numbers;
	private MarshmallowCreature[][] army;
	
	public Controller()
	{
		names = new String[4][4];
		numbers = new int[3][3];
		army = new MarshmallowCreature[2][2];
		
		fillNames();
		fillInts();
		fillCreatures();
	}
	
	public void start()
	{
		ArrayView myView = new ArrayView();
		myView.printCreatureInformation(army);
	}
	
	private void fillCreatures()
	{
		army[0][0] = new MarshmallowCreature();
		army[0][1] = new MarshmallowCreature("Bob", 3, 6, 4, true);
		
		army[1][0] = new MarshmallowCreature();
		army[1][1] = new MarshmallowCreature("Dave", 6, 2, 3, false);
	}
	
	private void fillNames()
	{
		names[0][0] = "Kamran";
		names[0][1] = "Palmer";
		names[0][2] = "Jordan";
		names[0][3] = "Manuel";
		names[1][0] = "Bella";
		names[1][1] = "Noelle";
		names[1][2] = "Maddi";
		names[1][3] = "Kelsey";
		names[2][0] = "Seductive Ghandi";
		names[2][1] = "Tyler";
		names[2][2] = "Mason";
		names[2][3] = "Nathan";
		names[3][0] = "Thomas";
		names[3][1] = "Catherine";
		names[3][2] = "Courtney";
		names[3][3] = "Aubrey";
		
	}
	
	private void fillInts()
	{
		numbers[0][0] = 42;
		numbers[0][1] = 24;
		numbers[0][2] = 69;
		numbers[1][0] = 2469;
		numbers[1][1] = 1997;
		numbers[1][2] = 12345;
		numbers[2][0] = 54321;
		numbers[2][1] = 43110;
		numbers[2][2] = 2012;
		
	}
}
