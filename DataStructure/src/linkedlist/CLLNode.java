package linkedlist;

public class CLLNode {

		private int data;
		public CLLNode next;
		public CLLNode tail;
		
		public CLLNode(int data,CLLNode next,CLLNode tail){
			this.data = data;
			this.next = next;
			this.tail = tail;
		}

		public CLLNode gettail() {
			return tail;
		}

		public void settail(CLLNode tail) {
			this.tail = tail;
		}

		public CLLNode(int data) {
			this.data = data;
		}

		public CLLNode getNext() {
			return this.next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public void setNext(CLLNode next) {
			this.next = next;
		}

		public void display(DLLNode l) {
			System.out.println(l.getData());	
		}

}
