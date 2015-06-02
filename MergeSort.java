package com.dhananjay.sorts;

public class MergeSort {
	int myArray[];
	int len;
	int [] tempArray;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2,4,98,76,61,55,3,79,5,7,8,9};
		
		MergeSort mrgSrt = new MergeSort();
		mrgSrt.sort(A);
		
	}
	public void sort(int [] A){
		this.myArray = A;
		int len = A.length;
		this.len = len;
		this.tempArray = new int[len];
		mergeSrt(0,len-1);
		printArray(myArray);
	}
	public void printArray(int []arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
	}
	public void mergeSrt(int low, int high){
		if(low<high){
			int mid = low + (high-low)/2;
			mergeSrt(low,mid);
			mergeSrt(mid+1, high);
			merge(low,mid,high);
		}
	}
	public void merge(int low, int mid, int high){
		for(int x=low;x<=high;x++){
			tempArray[x]=myArray[x];
		}
		int i=low;
		int j= mid+1;
		int k = low;
		while(i<=mid && j<=high){
			if(tempArray[i]<=tempArray[j]){
				myArray[k]=tempArray[i];
				i++;
			}
			else{
				myArray[k]=tempArray[j];
				j++;
			}
			k++;
		}
		while(i<=mid){
			myArray[k]=tempArray[i];
			i++;
			k++;
		}
	}
}
