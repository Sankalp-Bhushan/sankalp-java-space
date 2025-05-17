package SortingAlgorithms;

import java.util.Scanner;

public class CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		print(countSort(arr));
	}

	/*
	 * Count sort is used when the range is less and the frequency is high Count
	 * sort is a stable sort if there are three 3 then the one which came first will
	 * come first, it is called stable sort
	 */
	public static int[] countSort(int[] arr) {
		int n = arr.length;
		int lo = Integer.MAX_VALUE;
		int hi = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			lo = Math.min(arr[i], lo);
			hi = Math.max(arr[i], hi);
		}

		int[] fre = new int[hi - lo + 1];

		for (int i = 0; i < n; i++) {
			fre[arr[i] - lo]++;
		}

		// making prefix sum array to store the index of every element
		fre[0] -= 1;
		for (int i = 1; i <= (hi - lo); i++) {
			fre[i] += fre[i - 1];
		}

		// Now create a new array and store the sorted value according to their order
		int sortedArr[] = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			int index = arr[i] - lo;
			int indInSortedArr = fre[index]--;
			sortedArr[indInSortedArr] = arr[i];
		}

		return sortedArr;
	}

	public static void print(int[] arr) {
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
