
public class Arrays {
	private int[] intArray;
//	private int searchKey;
	private int nElemt = 0;
	
	public Arrays(int size){
		intArray = new int[size];
	}
	
	public void insert(int value){
		if(nElemt < (intArray.length-1)){
		intArray[nElemt] = value;
		nElemt++;
		}
		else{
			throw new ArrayIndexOutOfBoundsException(nElemt+1);
		}
	}
	
	public int search(int value){
		int i;
		for(i=0;i< nElemt;i++){
			if(intArray[i] == value)
				break;
		}
		
		if(i == nElemt) // at the end?
			return -1;
			else
				return i;
	}
	
	public void delete(int value){
		int j = search(value);
		if(j!=-1)
			nElemt--;
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
	
}
