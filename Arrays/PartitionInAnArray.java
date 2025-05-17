package Arrays;

import java.util.Scanner;

public class PartitionInAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		print(partition(arr, arr[1]));
	}

	/*
	 * we divide the array in three regions 
	 * 1 - unknown elements (i to end) 
	 * 2 - > elements (j to i-1) 
	 * 3 - <= elements (0 to j-1)
	 */
	public static int[] partition(int[] arr, int pivot) {
		int n = arr.length;
		int i = 0;
		int j = 0;
		while (i <= n) {
			if (arr[i] > pivot) {
				i++;
			} else {
				swap(arr, i, j);
				i++;
				j++;
			}
		}
		return arr;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr) {
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
