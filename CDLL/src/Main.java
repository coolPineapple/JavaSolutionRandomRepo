import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class Main {
	public static void main(String[] args) {
		CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
		cdll.current = new Node();
		Node start = cdll.current;
		start.data = 10;
		
		start.next = new Node();
		start.previous = start;
		start.next.data = 20;
		
		Node three = start.next.next;
		three = new Node();
		start.next.previous = start.next;
		start.next.next.data = 30;
		
		start.next.next.next = start;
		start.previous =
		
		
		
	}

}

 class Node{
	 		public int data;
            public Node next;
            public Node previous;

}

//The Circular Linked List class definition is as follows:

 class CircularDoublyLinkedList
{

            public int currentSize;
            public Node current;
            
            public CircularDoublyLinkedList() {
            	Node start = new Node();
            	current = start;
            	
            }
            
            
            public void insertBeforeCurrent(int n) {
            	Node new_node = new Node();
            	new_node.data = n;
            	new_node.next = current;
            	new_node.previous = current.previous;
            	current.previous.next = new_node;
            	current.previous = new_node;
            	
            	
            }

            public void insertAfterCurrent(int n) {
            	Node new_node = new Node();
            	new_node.data = n;
            	new_node.next = current.next;
            	new_node.previous = current;
            	current.next.previous= new_node;
            	current.next = new_node;
            	
            }
//            public Node search(int n) {
//            	
//            }
//
//            public boolean update(int o, int n) {
//            	
//            }
//
//            public boolean delete(int n) {
//            	
//            }
//
//            public void printSize() {
//            	
//            }
//
//            public void printCurrent() {
//            	
//            }
//
//            public void printForward() {
//            	
//            }
//
//            public void printReverse() {
//            	
//            }




}
