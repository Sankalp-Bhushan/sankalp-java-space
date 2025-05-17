package SortingAlgorithms;
import java.util.*;

public class SelectionsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		selectionSort(arr);
		print(arr);
	}
	
	/*
	 * in this we select on element and compare it with every other and brings the smallest one
	 * in first iteration the first element will the smallest one
	 * and in every iteration the starting of the array will become sorted
	 */
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
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
