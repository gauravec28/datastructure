package linkedlist;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		DoublyLinkedList l = new DoublyLinkedList();
		l.insert(0,0);
		l.insert(1,1);
		l.insert(2,2);
		l.insert(3,3);
		l.insert(4,4);
		l.insert(5,5);
		l.insert(6,6);
		l.insertAtTail(7);
		l.removeAtPos(4);
	//	l.insertAtBegin(new ListNode(8));
	//	l.removeFromEnd();
		System.out.println(l.toString());
	}

}
