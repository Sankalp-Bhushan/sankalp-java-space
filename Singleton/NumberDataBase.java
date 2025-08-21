package Singleton;

public class NumberDataBase {
	int numbers[];
	public static final int CAPACITY = 15;
	//Single instance of NumberDatabase
	private static NumberDataBase instance; 
	
	private NumberDataBase() {
		numbers = new int[CAPACITY];
		System.out.println("NumberDatabase.constructor: Numbers array is initialized.");
	}
	
	public static NumberDataBase getInstance() {
		//Check if the instance is already created, if not create it.
		if(instance == null) {
			System.out.println("NumberDatabase.getInstance: Instance is created");
			instance = new NumberDataBase();
		}
		System.out.println("NumberDatabase.getInstance: Instance is returned");
		return instance;
	}
	
	public void saveNumber(int number, int index) {
		//Checking if given index is within the capacity
		if(index -1 < CAPACITY) {
			numbers[index-1] = number;
		}		
	}
	
	public int getNumber(int index) {
		if(index -1 < CAPACITY)
			return numbers[index -1]; //Return the valid number
		else
			return -1; //Return the invalid number
	}
	
	public void printNumbers() {
		for(int counter=0; counter<CAPACITY; counter++) {
			System.out.println("Numbers["+ (counter+1)+"]: "+ numbers[counter]);
		}
	}
}
