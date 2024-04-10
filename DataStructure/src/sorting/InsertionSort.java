package sorting;

public class InsertionSort {
	public void sort(int[] arr){	
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
			if(arr[j-1]>arr[j]){
				arr[j-1] = arr[j-1]+arr[j];
				arr[j] = arr[j-1]-arr[j];
				arr[j-1] = arr[j-1]-arr[j];
			}
		}
		}
		printArray(arr);
	}
	
	public void printArray(int[] intArray){
		for(int i=0;i<intArray.length; i++){
			System.out.println(intArray[i]);
		}
	}
}
