package com.sorts;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {32,24,59,3,79,5,67,18,9};
		InsertionSort inSort= new InsertionSort();
		inSort.sort(A);
	}
	public void sort(int []arr){
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j]= arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		printArray(arr);
	}
	public static void printArray(int []arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
