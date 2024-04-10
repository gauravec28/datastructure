package stack;

public class queue {
	
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public void queue(int s){
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(long l){
		if(rear == maxSize-1)
			rear = -1;
		queArray[++rear] = l;
		nItems++;
	}
	
	public void remove(){
		long temp = queArray[front++];
		if(front == maxSize){
			front = 0;
		}
		nItems--;
	}
	
	public long peekFront() // peek at front of queue
	{
		return queArray[front];
	}
}
