package linkedlist;

public class CircularLinkedList {

	protected CLLNode tail;
	protected int length;

	public CircularLinkedList() {
		tail = null;
		length = 0;
	}

	public void addToBegin(int data) {
		addToHead(data);
	}

	public void addToHead(int data) {
		CLLNode node = new CLLNode(data);

		if (tail == null) {
			tail = node;
			tail.setNext(node);
		} else { // valid if u say tail to head in book
			node.setNext(tail.getNext());
			tail.setNext(node);
		}
	}

	public void addToEnd() {
		tail = tail.getNext();
	}

	public int peek() {
		return tail.getNext().getData();
	}

	public int tailPeek() {
		return tail.getData();
	}

	public int removeFromHead() {
		CLLNode temp = tail.getNext();

		if (tail == temp) {
			tail = null;
		} else {
			tail.setNext(temp.getNext());
			temp.setNext(null); // helps cleaning things up
		}
		length--;
		return temp.getData();
	}

	public int removeFromTail() {
		if (tail == null) {
			return Integer.MIN_VALUE;
		}

		CLLNode finger = tail;

		while (finger.getNext() != tail) {
			finger = finger.next;
		}

		finger.setNext(tail.getNext());
		tail = finger;
		return finger.getData();
	}

	public void remove(int data) {
		if (tail == null) {
			return;
		}
		CLLNode finger = tail;

		while (finger.getNext() != tail.getNext()) {
			if(finger.getNext().getData() == data)
				break;
			finger = finger.next;
		}
		finger.setNext(finger.getNext().getNext());
	}

}
