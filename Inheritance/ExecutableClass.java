package Inheritance;

public class ExecutableClass {

	public static void main(String[] args) {
		checkStaticBlocks();
	}
	
	public static void checkInhritance() {
		Animal animal = new Animal();
		Dog dog = new Dog();
		dog.print();
		animal.print();
		animal = dog;
		animal.print();
		Animal animal2 = new Dog();
		animal2.print();
	}
	
	public static void checkStaticBlocks() {
		StaticBlocks block = new StaticBlocks();
		String name = StaticBlocks.name;
		int number = StaticBlocks.number;
		System.out.println(name + " : " + number);
	}

}
