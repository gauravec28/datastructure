package stack;

public class StackArray {
	private int maxSize; // size of stack array
	private long[] stackArray;
	private int top; // top of stack
	//--------------------------------------------------------------
	
	public StackArray(int max){
		maxSize = max;
		stackArray = new long[max];
		top = -1;		
	}
	
	public long push(long l){
		return stackArray[++top] = l;
	}
	
	public long pop(){
		return stackArray[top--];
	}
	
	public boolean isEmpty() // true if stack is empty
	{
	return (top == -1);
	}
	
	public boolean isFull() // true if stack is full
	{
	return (top == maxSize-1);
	}
	
}
