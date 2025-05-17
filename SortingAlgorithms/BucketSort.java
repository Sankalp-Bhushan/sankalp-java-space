package SortingAlgorithms;

import java.util.Scanner;

public class BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		bucketSort(arr);
		print(arr);
	}
	
	public static void bucketSort(int[] arr) {
		int n = arr.length;
		int lo = Integer.MAX_VALUE;
		int hi = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			lo = Math.min(arr[i], lo);
			hi = Math.max(arr[i], hi);
		}
		
		int[] fre = new int[hi-lo];
		
		for(int i=0; i<n; i++) {
			fre[arr[i]-lo]++;
		}
		
		int k = 0;
		for(int i=0; i<(hi-lo); i++) {
			if(fre[i] != 0) {
				int f = fre[i];
				while(f-->0) {
					arr[k++] = i;
				}
			}
		}
		
	}
	
	public static void print(int[] arr) {
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
}
