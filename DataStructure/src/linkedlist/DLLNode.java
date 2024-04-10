package linkedlist;

public class DLLNode {

		private int data;
		public DLLNode next;
		public DLLNode prev;
		
		public DLLNode(int data,DLLNode next,DLLNode prev){
			this.data = data;
			this.next = next;
			this.prev = prev;
		}

		public DLLNode getPrev() {
			return prev;
		}

		public void setPrev(DLLNode prev) {
			this.prev = prev;
		}

		public DLLNode(int data) {
			this.data = data;
		}

		public DLLNode getNext() {
			return this.next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public void setNext(DLLNode next) {
			this.next = next;
		}

		public void display(DLLNode l) {
			System.out.println(l.getData());	
		}

}
