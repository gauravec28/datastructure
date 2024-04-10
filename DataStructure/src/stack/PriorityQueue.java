package stack;

public class PriorityQueue {
	
	private int maxSize;
	private long[] queArray;
	private int nItems;
	
	public void queue(int s){
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}
	
	public void insert(long l){
		if(maxSize == 0){
		queArray[nItems++] = l;
		}
		else
		{
			for(int i =maxSize-1;i>=0;i--){
				if(l>queArray[i]){
					long temp = queArray[i];
					queArray[i] = temp;
					queArray[i+1] = l;
					nItems++;
				}
			}
		}
	}
	
	public void remove(){
		long temp = queArray[nItems++];
		nItems--;
	}
	
	public long peekFront() // peek at front of queue
	{
		return queArray[front];
	}
}
