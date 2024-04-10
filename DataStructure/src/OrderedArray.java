
public class OrderedArray {
	private int[] intArray;
	private int nElemt = 0;
	
	public OrderedArray(int size){
		intArray = new int[size];
	}
	
	// ordered insertion
	public void insert(int value){
		 if(nElemt < (intArray.length-1)){
			int i,j;
			for(j=0;j<nElemt;j++){
				if(intArray[j]>value)
					break;
			}
			
			for(i=nElemt;i>j;i--){
				intArray[i] = intArray[i-1];
			}
			
			intArray[j] = value;			
		nElemt++;
		}
		else{
			throw new ArrayIndexOutOfBoundsException(nElemt+1);
		}
	}
	
	//binary search
	public int search(int value){
		int up=nElemt,low=0;
		while((up-low)>1){
			if(intArray[low+((up-low)/2)]==value){
				return (low+(up-low)/2);
			}			
			else if(intArray[low +((up-low)/2)]>value){
				up = up - (up-low)/2;
			}
			else {
				low = low + (up-low)/2;
			}
			
		}
			return -1;

	}
	
	public void delete(int value){
		int j = search(value);
		for(int i=j+1;i<=nElemt;i++){
			intArray[j] = intArray[i];
			j++;
		}
	}
	
	public void printArray(){
		for(int i=0;i<nElemt; i++){
			System.out.println(intArray[i]);
		}
	}
	
	public int getMaxKey(){
		int maxKey=0;
		for(int i =0;i<=nElemt;i++){
			if(intArray[i]>maxKey)
				maxKey = intArray[i];
		}
		delete(maxKey);
		return maxKey;
	}
	
}
