package Arrays;

import java.util.*;

public class ArraysClass {
	public static void main(String[] args) {
		int[] arrayA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("asList() - Returns a fixed-size list backed by the specified Arrays");
		System.out.println(Arrays.asList(arrayA));
		System.out.println(
				"binarySearch() - Searches for the specified element in the array with the help of the Binary Search Algorithm");
		System.out.println("First Occurance of 5 is : " + Arrays.binarySearch(arrayA, 5));
		System.out.println("If it won't find the element then it will return the negative of (n-1)");
		System.out.println("First Occurance of 5 is : " + Arrays.binarySearch(arrayA, 0, 3, 5));

	}
}
