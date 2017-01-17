package com.sorts;

public class QuickSort {
	int myArr[];
	int len;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2,4,5,3,79,5,7,8,9};
		QuickSort q= new QuickSort();
		//int length = A.length-1;
		q.sort(A);
		for( int i : A){
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	public static void printArray(int []A){
		for( int i : A){
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	public  void sort(int []myAr){
		
		this.myArr = myAr;
		len = myArr.length;
		SortIt(0,len-1);
	}
	public  void SortIt(int low, int high){
		int i =low;
		int j = high;
		//int pivot = myArr[low+ (high-low)/2];
		int pivot = myArr[low];
		while(i<=j){
			while(myArr[i]<pivot){
				i++;
			}
			while(myArr[j]>pivot){
				j--;
			}
			if(i<=j){
				int temp = myArr[i];
				myArr[i]=myArr[j];
				myArr[j]=temp;
				i++;
				j--;
				//printArray(myArr);
			}
			
		}
		
		if(low<j){
			SortIt(low,j);
		}
		if(i<high){
			SortIt(i,high);
		}
		
		
		
		
	}

}
