
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {31,15,4,2,9,16,8,1,0,1};
		bubbleSort(A);

	}
	
	public static void bubbleSort(int []arr){
		int len = arr.length;
		for (int i=len-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
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
