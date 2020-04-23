import java.util.List;
import java.util.Queue;
import java.util.LinkedList;


public class Node {
	Node left;
	Node right;
	int data;
	public Node(int data) {
		this.data = data;
	}

}
class Main{
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right  = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left  = new Node(32);
		root.right.right  = new Node(34);
		
		System.out.println("Height  of Tree is : "+getHeight(root));
		
//		printLevelOrder(root, 1);
//		System.out.println();
//		printLevelOrder(root, 2);
//		System.out.println();
//		printLevelOrder(root, 3);
//		System.out.println();
//		printLevelOrder(root, 0);
		
		//after mirriring the tree
		returnMirrorTree(root);
		System.out.println("\nLevel 1: ");
		printLevelOrder(root, 1);
		System.out.println("\nLevel 2: ");
		printLevelOrder(root, 2);
		System.out.println("\nLevel 3: ");
		printLevelOrder(root, 3);
		
		insertIntoBT(root, 999);
		
		System.out.println("\n After INSERTION Level 1: ");
		printLevelOrder(root, 1);
		System.out.println("\nLevel 2: ");
		printLevelOrder(root, 2);
		System.out.println("\nLevel 3: ");
		printLevelOrder(root, 3);
		System.out.println("\nLevel 4: ");
		printLevelOrder(root, 4);
		
		
		
	}
	
	static Node returnMirrorTree(Node root) {
		if(root != null) {
			returnMirrorTree(root.left);
			returnMirrorTree(root.right);
			Node temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		return root; 
	}
	
	static void printLevelOrder(Node root, int level) {
		if(root == null) {
			return;
		}
		if(level == 1) {
			System.out.print(root.data+" ");
		}
		printLevelOrder(root.left, level-1);
		printLevelOrder(root.right, level-1);
		
	}
	
	static int getHeight(Node root) {
		if (root == null) {
			return 0;
		}
		int m = 1 + getHeight(root.left);
		int n = 1 + getHeight(root.left);
		return java.lang.Math.max(m, n);
	}
	// insertion into bt
	
	static void insertIntoBT(Node root, int data) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		Node temp = null;
		
		while(queue.isEmpty() == false) {
			 temp = queue.poll();
			 
		
		if(temp.left == null) {
			temp.left = new Node(data);
			break;
			
		}
		else {
			queue.add(temp.left);
		}
		if(temp.right ==null) {
			temp.right = new Node(data);
			break;
		}
		else {
			queue.add(temp.right);
		}
		
		}
	}
}
