package Arrays;

import java.util.Scanner;

public class SortingOfDates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		sortDates(arr);
		print(arr);
	}

	public static void sortDates(String[] arr) {
		countSort(arr,1000000,100,32); // for Days
		countSort(arr,10000,100,13); // for Months
		countSort(arr,1,10000,2501); // for Years
	}

	public static void countSort(String[] arr, int div, int mod, int range) {
		int n = arr.length;
		String ans[] = new String[n];
		int[] fre = new int[range];

		for (int i = 0; i < n; i++) {
			fre[Integer.parseInt(arr[i], 10) / div % mod]++;
		}

		// making prefix sum array to store the index of every element
		for (int i = 1; i < 10; i++) {
			fre[i] += fre[i - 1];
		}

		for (int i = n - 1; i >= 0; i--) {
			int position = fre[Integer.parseInt(arr[i], 10) / div % mod] - 1;
			ans[position] = arr[i];
			fre[Integer.parseInt(arr[i], 10) / div % mod]--;
		}

		// Refill the original array with the ans array
		for (int i = 0; i < n; i++) {
			arr[i] = ans[i];
		}

	}

	public static void print(String[] arr) {
		for (String e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
