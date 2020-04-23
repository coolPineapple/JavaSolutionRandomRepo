
public class intBST {
	static void searchEle(intNode root, int searchEle) {
		if(root == null) {
			return;
		}
		if(root.data == searchEle) {
			System.out.println("Element found "+root.data);
		}
		searchEle(root.left, searchEle);
		searchEle(root.right, searchEle);
		
		
	}
	public static void main(String[] args) {
		intNode root = new intNode(10);
		root.left = new intNode(20);
		root.right = new intNode(30);
		root.left.left = new intNode(40);
		
		intNode in=new intNode(1000);
		
		
		
		
		searchEle(root, 30);
	}

}

 class intNode{
	int data;
	intNode left;
	intNode right;
	public intNode(int data) {
		this.data = data;
		
	}
}
