package SortingAlgorithms;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		heapSort(arr,arr.length);
		System.out.println("Works only for complete binary Tree");
		print(arr);
	}
	
	public static void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i=n/2; i>=0; i--){
            heapify(arr,n,i);
        }
    }
 
    //Heapify function to maintain heap property.
    public static void heapify(int arr[], int n, int i)
    {
        // Your code here
        int l = 2*i;
        int r = 2*i+1;
        int largest = i;
        if(l<n && arr[l] < arr[largest]) largest = l;
        if(r<n && arr[r] < arr[largest]) largest = r;
        if(largest != i){
            int temp = arr[largest];
            arr[largest]  =arr[i];
            arr[i] = temp;
            heapify(arr,n,largest);
        }
    }
    
    //Function to sort an array using Heap Sort.
    public static void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr,n);
        int ans[] = new int[n];
        int k = 0;
        for(int i=n-1; i>=0; i--){
            ans[k++] = arr[0];
            arr[0] = arr[i];
            heapify(arr,i,0);
        }
        for(int i=0; i<n; i++){
            arr[i] = ans[i];
        }
    }
    
    public static void print(int[] arr) {
    	for(int e:arr) System.out.print(e+" ");
    	System.out.println();
    }
	
}
