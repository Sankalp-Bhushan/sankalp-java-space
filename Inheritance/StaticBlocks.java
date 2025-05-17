package Inheritance;

public class StaticBlocks {
	
	static String name;
	static int number; 
	
	static {
		name = "Sankalp Bhushan";
		number = 1999;
		String str = "The values are : " + "\n\u2022 " + name + "\n\u2022 " + number;
		System.out.println(str);
	}

	{
		System.out.println("Normal Block is executed.");
	}
	
}
