package SortingAlgorithms;
import java.util.*;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		quickSort(arr,0,n-1);
		print(arr);
	}
	
	public static void quickSort(int[] arr,int lo,int hi) {
		if(lo >= hi) return;
		int pivotElement = arr[hi];
		int pivot = partition(arr,pivotElement,lo,hi);
		quickSort(arr,lo,pivot-1);
		quickSort(arr,pivot+1,hi);
	}
	
	public static int partition(int[] arr,int pivot,int lo,int hi) {
		int i = lo;
		int j = lo;
		while(i<=hi) {
			if(arr[i] <= pivot) {
				swap(arr,i,j);
				i++;
				j++;
			} else {
				i++;
			}
		}
		return j-1;
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void print(int[] arr) {
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
}
