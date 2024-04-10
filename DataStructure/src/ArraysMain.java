public class ArraysMain {
	public static void main(String[] args) {
		OrderedArray a = new OrderedArray(10);
		a.insert(2);
		a.insert(1);
		a.insert(0);
		a.insert(6);
		a.insert(4);
		a.insert(3);
		a.insert(5);
		
		System.out.println("Print after inserting..........");
		a.printArray();

		System.out.println("your element is at index "+a.search(6));
		
		a.delete(3);
		System.out.println("Print after deleting...........");
		a.printArray();
		
		System.out.println("max key "+a.getMaxKey());
	}
}
