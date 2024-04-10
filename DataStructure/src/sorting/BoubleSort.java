package sorting;

public class BoubleSort {
	public void sort(int[] arr){
		
		for(int i=1;i<arr.length;i++){
			int j=0;
		while(j<arr.length-i){
			if(arr[j]>arr[j+1]){
				arr[j] = arr[j]+arr[j+1];
				arr[j+1] = arr[j]-arr[j+1];
				arr[j] = arr[j]-arr[j+1];
				}
			j++;
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
