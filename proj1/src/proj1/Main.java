package proj1;

public class Main {
	
	static Node reverseLL(int m,int n , Node head) {
		Node ptr = head;
		
		int count = 0;
		Node revNode;
		while(ptr != null) {
			if(count == m) {
				Node rev_Nodes = appendATstart(revNode, )
			}
		}
		
		
		
		return head;
	}
	static Node appendATstart(Node node, int num) {
		if(node.next == null) {
			node = new Node(num);
			return node;
		}
		Node new_node = new Node(num);
		new_node.next = node;
		return new_node;
		
		
		/* node: 1 >> 2 >> 3 >>
		num = 10;
		new_node = 10;
		new_node.next  = node;
		return  
		*/
	}

}

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		next = null;
		System.out.println();
	}
}
