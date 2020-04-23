
public class Node {
	int data;
	Node next;
	Node alternate;
	Node(int data){
		this.data = data;
	}

}
class Clone{
	static Node cloneLL(Node head) {
		
		
		
		return head;
	}
	
	public static void main(String[] args) {
		Node a= new Node(100);
		a.next= new Node(200);
		a.next.next= new Node(300);
		a.next.next.next= new Node(400);
		a.next.next.next.next= new Node(500);
		a.next.next.next.next.next= new Node(600);
		// alternate pointers
		a.alternate = a.next.next;
		a.next.alternate = 
		
		
	}
}
