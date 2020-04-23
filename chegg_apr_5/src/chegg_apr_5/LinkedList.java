package chegg_apr_5;

public class LinkedList<T> { // MUST IMPLEMENT ALL FUNCTIONS
	private Node head;
	private Node tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public T getFrontData() {
		
			return head.data;
		
	}

	public int getLength() {
		int lengthCounter=0;
		Node currentPointer = head;
		while(currentPointer != null) {
			lengthCounter++;
			currentPointer = currentPointer.next;
		}
		return lengthCounter;
	}

	public void addToFront(T toAdd) {
		if(head == null) {
			head = new Node(toAdd,null);
			return;
		}
		else {
			Node nextPtr = head;
			Node temp = new Node(toAdd, nextPtr.next);
			head = temp;
		}
		
	}

	public void addToEnd(T toAdd) {
		if(head == null) {
			head = new Node(toAdd,null);
			return;
		}
		Node temp= new Node(toAdd,null);
		
		Node tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = temp;
	}

	public T removeFromFront() {
		if(head == null) {
			return null;
		}
		// By changing the pointer of head Node to head.next, we are skipping the first element
		Node temp = head;
		head = head.next;
		return temp.getdata();
		
	}
	

	@Override
	public String toString() {
		return "LinkedList [head=" + head + ", tail=" + tail + "]";
	}

	private class Node {
		private T data;
		private Node next;

		Node(T dataPassed, Node nextPassed) {
			data = dataPassed;
			next = nextPassed;
		}

		public void setdata(T dataPassed) {
			data = dataPassed;
		}

		public T getdata() {
			return data;
		}

		public Node getnext() {
			return next;
		}

		public void setnext(Node passed) {
			next = passed;
		}

		public String toString() {
			return ("" + data);
		}
	}
}
// End of LinkedList.java
//Code for Stack.java







