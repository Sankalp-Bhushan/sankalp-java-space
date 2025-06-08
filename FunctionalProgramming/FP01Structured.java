package FunctionalProgramming;
import java.util.*;

public class FP01Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		List<Integer> list = List.of(12,2,4,5,6,7,34,5,6,5,54);
		printAllNumberInListStructured(list);
		System.out.println();
		printAllNumberInListFunctional(list);
		System.out.println();
		printAllEvenNumberInListFunctional(list);
		System.out.println();
		printAllEvenNumberInListFunctionalUsingLambda(list);
		System.out.println();
		printSquareNumberInListFunctionalUsingMapping(list);
	}
	
	public static void printAllNumberInListStructured(List<Integer> ll) {
		//How to loop all the numbers
		for(int e : ll) System.out.print(e+" ");
	}
	
	public static boolean isEven(int number) {
		return number%2 == 0;
	}
	
	public static void printAllEvenNumberInListFunctional(List<Integer> ll) {
		//Focus on What to do?
		//Convert the list in a Stream 
		//We use method reference in this (ClassName :: methodName)
		//We use Filters to apply some condition
		ll.stream()
		.filter(FP01Structured :: isEven) //Filter
		.forEach(FP01Structured :: print);
		System.out.println();
	}
	
	public static void printAllEvenNumberInListFunctionalUsingLambda(List<Integer> ll) {
		//Focus on What to do?
		//Convert the list in a Stream 
		//We use method reference in this (ClassName :: methodName)
		//We use Filters to apply some condition
		ll.stream()
		.filter(number -> number%2==0) //Filter
		.forEach(FP01Structured :: print);
		System.out.println();
	}
	
	public static void printSquareNumberInListFunctionalUsingMapping(List<Integer> ll) {
		ll.stream()
		.filter(number -> number%2==0) //Filter
		.map(number -> number * number) //Assign new value to the stream number
		.forEach(FP01Structured :: print);
		System.out.println();
	}
	
	public static void printAllNumberInListFunctional(List<Integer> ll) {
		//Focus on What to do?
		//Convert the list in a Stream 
		//We use method reference in this (ClassName :: methodName)
		ll.stream().forEach(FP01Structured :: print);
		System.out.println();
		ll.stream().forEach(System.out :: print);
		System.out.println();
	}
	
	public static void print(int number) {
		System.out.print(number + " ");
	}

}
