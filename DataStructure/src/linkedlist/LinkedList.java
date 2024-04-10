package linkedlist;

public class LinkedList {

	private int length = 0;
	ListNode head;

	public LinkedList() {
		length = 0;
	}

	// return head node
	public synchronized ListNode getHead() {
		return head;
	}

	// to get length of list
	public int getListLength() {
		return length;
	}

	public synchronized void insertAtBegining(ListNode node) {
		node.setNext(head);
		head = node;
		length++;
	}

	public synchronized void insertAtEnd(ListNode node) {
		if (head == null)
			head = node;
		else {
			ListNode p, q = null;
			for (p = head; (p.getNext()) != null; p = q) {
				q = p.getNext();
			}
			q.setNext(node);
			length++;
		}
	}

	public synchronized void insert(int data, int position) {
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (head == null) {
			head = new ListNode(data);
		} else if (position == 0) {
			ListNode temp = new ListNode(data);
			temp.setNext(head);
			head = temp;
		}
		// Find the correct position and insert
		else {
			ListNode temp = head;
			ListNode newNode = new ListNode(data);
			for (int p = 1; p < position; p++) {
				temp = temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		length++;
	}

	public synchronized void removeFromBegin() {
		ListNode node = head;
		if (node != null) {
			head = node.getNext();
			node.setNext(null);
		}
	}

	public synchronized void removeFromEnd() {
		ListNode p = head, q = null;
		while ((q = p.getNext()) != null) {
			q = p.getNext();
		}
		q.setNext(null);
		length--;
	}

	public synchronized void removeMatched(ListNode node) {
		if (head == null) {
			return;
		}
		if (node.equals(head)) {
			head = head.getNext();
			length--;
		}
		ListNode p = head, q = null;
		while ((q = p.getNext()) != null) {
			if (node.equals(q)) {
				p.setNext(q.getNext());
				length--;
				return;
			}
			p = q;
		}
		q.setNext(null);
	}

	public void remove(int position) {
		if (position < 0)
			position = 0;
		if (position >= length)
			position -= length - 1;
		if (head == null)
			return;
		if (position == 0) {
			head = head.getNext();
		} else {
			ListNode temp = head;
			for (int i = 0; i < position - 1; i++) { // reach a step before to
														// position and set next
														// as next of next
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		length--;
	}

	public String toString() {
		String result = "[";
		if (head == null) {
			return result + "]";
		} else {
			ListNode temp = head, p;
			while ((p = temp.getNext()) != null) {
				result = result + "," + p.getData();
				temp = temp.getNext();
			}
			return result + "]";
		}
	}

	public int getPosition(int data) {
		ListNode temp = head;
		for (int i = 1; i < length - 1; i++) { // reach a step before to
												// position and set next as next
												// of next
			if (temp.getData() == data)
				return i;
			temp = temp.getNext();
		}
		return -1;
	}

	public void clearList() {
		head = null;
		length = 0;
	}
	
	public int findMax(ListNode node){
		int current = node.getData();
		int next;
		if(node.getNext() == null)
			return current;
		else
			next = findMax(node.getNext());
		
		if(current >next)
			return current;
		else
			return next;
			
			
	}
}
