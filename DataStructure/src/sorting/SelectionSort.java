package sorting;

public class SelectionSort {
	public void sort(int[] arr){	
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length-1;j++){
			if(arr[j]<arr[i]){
				arr[j] = arr[j]+arr[i];
				arr[i] = arr[j]-arr[i];
				arr[j] = arr[j]-arr[i];
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
