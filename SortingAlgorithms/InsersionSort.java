package SortingAlgorithms;

import java.util.*;

public class InsersionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr);
		print(arr);
	}

	/*
	 * in this the first part is considered as sorted
	 * and we try to find the particular element can fit in which place
	 */
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		int i = 1;
		while (i < n) {
			int j = i;
			int temp = arr[i];
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
			i++;
		}
	}

	public static void print(int[] arr) {
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
