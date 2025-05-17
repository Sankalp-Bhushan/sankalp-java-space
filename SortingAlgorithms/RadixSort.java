package SortingAlgorithms;

import java.util.Scanner;

public class RadixSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		radixSort(arr);
		print(arr);
	}

	/*
	 * in this we first sort the numbers on the basis of first place, then second,
	 * and so on like 233,445,677 in these numbers, we first compare 3,5,7 then
	 * 3,4,7 and then 2,4,6
	 */
	public static void radixSort(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int val : arr) {
			max = Math.max(val, max);
		}

		// if you want to take the digit at some place
		// then divide the number with the place value and take the modulus with 10
		// Sorting of dates is one of the application of the Radix Sort
		int exp = 1;
		while (exp <= max) {
			countSort(arr, exp);
			exp = exp * 10;
		}
	}

	public static void countSort(int[] arr, int exp) {
		int n = arr.length;
		int ans[] = new int[n];
		int[] fre = new int[10];

		for (int i = 0; i < n; i++) {
			fre[arr[i] / exp % 10]++;
		}

		// making prefix sum array to store the index of every element
		for (int i = 1; i < 10; i++) {
			fre[i] += fre[i - 1];
		}

		for (int i = n - 1; i >= 0; i--) {
			int position = fre[arr[i] / exp % 10] - 1; 
			ans[position] = arr[i];
			fre[arr[i] / exp % 10]--;
		}

		// Refill the original array with the ans array
		for (int i = 0; i < n; i++) {
			arr[i] = ans[i];
		}

	}

	public static void print(int[] arr) {
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
