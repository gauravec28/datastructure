package linkedlist;

public class DoublyLinkedList {
	private int length = 0;
	private DLLNode head;
	private DLLNode tail;

	public DoublyLinkedList() {
		length = 0;
		head = null;
		tail = null;
	}
	
	// return head node
	public synchronized DLLNode getHead() {
		return head;
	}

	// to get length of list
	public int getListLength() {
		return length;
	}
	
	public int getPosition(int data) {
		DLLNode temp = head;
		for (int i = 1; i < length - 1; i++) { // reach a step before to
												// position and set next as next
												// of next
			if (temp.getData() == data)
				return i;
			temp = temp.getNext();
		}
		return -1;
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	public synchronized void insertAtBegin(int newValue){
		DLLNode dllNode = new DLLNode(newValue,head,tail);
		head = dllNode;
		if(isEmpty()){
			tail=head;
		}
		length ++;
	}
	
	public synchronized void insert(int data,int pos){
		if(pos < 0){
			 pos = 0;
		}
		if(pos > length){
			pos = length;
		}
		if(head == null){
			insertAtBegin(data);
		}
		else if(pos == 0){
			DLLNode dllNode = new DLLNode(data,head,null);
			head = dllNode;
			length ++;
		}
		else{
			DLLNode temp = head;
			for(int i=1;i<pos;i++){
				temp = temp.getNext();
			}
			DLLNode newNode = new DLLNode(data);
			newNode.next = temp.next;
			newNode.prev = temp;
			if(newNode.next != null)
			newNode.next.prev = newNode;
			else
				tail = newNode;
			temp.next = newNode;
		}
		length ++;
		
	}
	
	public void insertAtTail(int newValue){
		DLLNode node = new DLLNode(newValue, null, tail.getPrev());
		tail.setNext(node);
		tail = node;
		length ++;
	}
	
	public void removeAtBegin(){
		head = head.getNext();
		head.setPrev(null);
		length --;
	}
	
	public void removeAtPos(int pos){
		if(pos < 0){
			 pos = 0;
		}
		if(pos > length){
			pos = length;
		}
		if(head == null){
			return;
		}
		else if(pos == 0){
			head = head.next;
			if(head == null)
				tail = head;
			length--;
		}
		else{
			DLLNode temp = head;
			for(int i=1;i<pos;i++){
				temp = temp.getNext();
			}
			temp.next.setPrev(temp.getPrev());
			temp.prev.setNext(temp.next);
			length--;
			
		}
	}
	
	public void removeTail(){
		
	}
	
	public String toString() {
		String result = "[";
		if (head == null) {
			return result + "]";
		} else {
			DLLNode temp = head, p;
			result = result + head.getData();
			while ((p = temp.getNext()) != null) {
				result = result + "," + p.getData();
				temp = temp.getNext();
			}
			return result + "]";
		}
	}
	
}
