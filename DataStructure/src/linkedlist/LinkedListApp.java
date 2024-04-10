package linkedlist;

public class LinkedListApp {
	public static void main(String args[]){
		LinkedList l = new LinkedList();
		l.insertAtBegining(new ListNode(0));
		l.insert(1,1);
		l.insert(2,2);
		l.insert(3,3);
		l.insert(4,4);
		l.insert(5,5);
		l.insert(6,6);
		l.insertAtEnd(new ListNode(7));
		l.insertAtBegining(new ListNode(8));
		l.removeFromEnd();
		l.toString();
	}
}
