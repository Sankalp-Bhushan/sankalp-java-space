package SortingAlgorithms;

import java.util.*;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		print(mergeSort(arr, 0, n - 1));
	}

	/*
	 * we divide the array in the two half and pass it to the recursive function and
	 * believe that it will come as sorted then we merge it.
	 */
	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int res[] = new int[1];
			res[0] = arr[lo];
			return res;
		}

		int mid = (lo + hi) / 2;
		int[] left = mergeSort(arr, lo, mid);
		int[] right = mergeSort(arr, mid + 1, hi);

		int[] res = merge(left, right);

		return res;
	}

	public static int[] merge(int[] a, int[] b) {
		int na = a.length;
		int nb = b.length;
		int ans[] = new int[na + nb];

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < na && j < nb) {
			if (a[i] < b[j]) {
				ans[k++] = a[i++];
			} else {
				ans[k++] = b[j++];
			}
		}
		
		while (i < na) {
			ans[k++] = a[i++];
		}

		while (j < nb) {
			ans[k++] = b[j++];
		}
		return ans;
	}

	public static void print(int[] arr) {
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
