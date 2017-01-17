package com.sorts;


public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {32,24,59,3,79,5,67,18,9};
		SelectionSort selSort= new SelectionSort();
		selSort.sort(A);
	}
	public void sort(int []arr){
		for(int i=0;i<arr.length-1;i++){
			int minimum=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[minimum]>arr[j]){
					minimum = j;
				}
			}
			int temp = arr[minimum];
			arr[minimum] = arr[i];
			arr[i] = temp;
			//printArray(arr);    //uncomment this line to see step by step results
		}
		printArray(arr);
	}
	public static void printArray(int []arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		//System.out.println("\n");    //uncomment this line while watching step by step results
	}
}
