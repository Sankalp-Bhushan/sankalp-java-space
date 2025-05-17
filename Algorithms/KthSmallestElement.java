package Algorithms;

import java.util.Scanner;

// Quick Select Algorithm
public class KthSmallestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kth = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(quickSelect(arr,0,n-1,kth-1));
	}

	/*
	 * Convert Kth element to index (k-1) do the partition until the pivot element
	 * index is equal to the k-1 index 
	 * this algorithm is called quick select
	 */

	public static int quickSelect(int arr[], int lo, int hi, int k) {
		int pivot = arr[hi];
		int pi = partition(arr, pivot, lo, hi);
		if (k > pi) {
			return quickSelect(arr, pi + 1, hi, k);
		} else if (k < pi) {
			return quickSelect(arr, lo, pi - 1, k);
		} else {
			return arr[pi];
		}
	}

	public static int partition(int[] arr, int pivot, int lo, int hi) {
		int i = lo;
		int j = lo;
		while (i <= hi) {
			if (arr[i] <= pivot) {
				swap(arr, i, j);
				i++;
				j++;
			} else {
				i++;
			}
		}
		return j - 1;
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
