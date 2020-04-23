package chegg_apr_07;
//Whit those above plz help me fill the blank in the code below:

/**
* Binary search tree for integers ONLY.
*/
public class BinarySearchTree {
protected BSTNode root; // reference to the root of this binary search tree

/**
* Initializes the bst to empty creating a dummy root node.
*/
public BinarySearchTree() {
root = null;
}

/**
* Initialized the bst with a given root node
* @param root A given binary tree node
*/
public BinarySearchTree(BSTNode root) {
this.root = root;
}

/**
* returns true if this BST is empty, false otherwise
* @return boolean value
*/
public boolean isEmpty() {
return root == null;
}

/////////////////// Your lab assignment starts from here //////////////////

/**
* Returns true if this BST contains a node with integer c
* @param c an integer
* @return
*/
public boolean contains(int c) {
return search(c, root);
}

/**
* A recursive helper function for contains
* Returns true if the subtree rooted at node contains integer c;
* Otherwise return false.
* @param c A target integer you want to search
* @param node A binary search tree node
* @return
*/
public boolean search(int c, BSTNode node) {
	// if node is null 
	if(node == null) {
		return false;
	}
	// if element is found
	if(node.getInfo() ==  c) {
		return true;
	}
	// if c is greater than node info
	if(node.getInfo() > c) {
		return search(c, node.getLeft());
	}
	
	//if c is less than node info
	return search(c, node.getRight());
}

/**
* Adds integer c to this BST
* @param c The integer that you want to add
*/
public void add(int c) {
root = recAdd(c, root);
}

/**
* The recursive helper function for add.
* Adds integer c to tree rooted at node; tree retains its BST property.
* @param c The integer you want to add
* @param node A binary tree node
* @return binary tree node
*/
public BSTNode recAdd(int c, BSTNode node) {
	/* if node is empty, then creating  a new node*/
	if(node == null) {
		node = new BSTNode(c);
		return node;
	}
	
	/* Finding the correct place to insert into BST*/
	if(c > node.getInfo()) {
		node.setRight(recAdd(c, node.getRight()));

	}
	else if( c< node.getInfo()) {
		node.setLeft(recAdd(c, node.getLeft()));
	}
	/* returning the same node*/
	return node;
	
}

/**
* An iterative implementation of add.
* @param c The integer you want to add
*/
public void iterAdd(int c) {
	BSTNode node_new =new BSTNode(c);
	/* ptr1 traverses from root of the BSTNode to bottom of the tree to 
	 * find the correct place to insert the node*/
	BSTNode ptr1 = root;
	
	/* ptr2 ptr2 holds the previous value of ptr1*/
	BSTNode ptr2 = null;
	
	/* this loop traverses the ptr1 to the place where nodes are to be inserted*/
	while(ptr1 != null) {
		ptr2 = ptr1;
		if(ptr1.getInfo() > c) {
			ptr1 = ptr1.getLeft();
		}
		else {
			ptr1 =ptr1.getRight();
		}
	}
	
	/* if root of BSTNode is empty, then the new Node is root node of the tree*/
	if(ptr2 == null) {
		ptr2 = node_new;
	}
	else if (c < ptr2.getInfo()) {
		ptr2.setLeft(node_new);
	}
	else {
		ptr2.setRight(node_new);
	}
	
	
	
	
}

/**
* Print the BST in preorder, inorder or postorder
* @param t A enum type variable which is PREORDER, INORDER or POSTORDER
*/
public void display(Traversal t) {
switch(t) {
case PREORDER:
preorderDisplay(root);
break;
case INORDER:
inorderDisplay(root);
break;
case POSTORDER:
postorderDisplay(root);
break;
default:
break;
}
}

/**
* Prints the integers of the subtree whose root is referenced by node.
* Uses preorder traversal.
* Can be implemented in a recursive way.
* @param node
*/
public void preorderDisplay(BSTNode node) {
	if(node == null) {
		return;
	}
	System.out.print(node.getInfo()+" ");
	preorderDisplay(node.getLeft());
	preorderDisplay(node.getRight());
}

/**
* Prints the integers of the subtree whose root is referenced by node.
* Uses inorder traversal.
* Can be implemented in a recursive way.
* @param node
*/
public void inorderDisplay(BSTNode node) {
	if(node == null) {
		return;
	}
	
	inorderDisplay(node.getLeft());
	System.out.print(node.getInfo()+" ");
	inorderDisplay(node.getRight());
}

/**
* Prints the integers of the sbutree whose root is referenced by node.
* uses postorder traversal.
* Can be implemented in a recursive way.
* @param node
*/
public void postorderDisplay(BSTNode node) {
	if(node == null) {
		return;
	}
	postorderDisplay(node.getLeft());
	postorderDisplay(node.getRight());
	System.out.print(node.getInfo()+" ");
}

/**
* Returns the maximum depth of this BST.
* The maximum depth is the number of nodes along the longest path from the root node down
* to the farthest leaf node.
* @return
*/
public int maxDepth() {
return recMaxDepth(root);
}

/**
* The recursive helper function for mexDepth
* Returns the max depth of the subtree whose root is referenced by node
* @param node
* @return
*/
private int recMaxDepth(BSTNode node) {
	if(node == null) {
		return 0;
	}
	/* calculating left subtree length*/
	int l_SubTree_length = 1 + recMaxDepth(node.getLeft());
	
	/* calculating right subtree length*/
	int r_SubTree_length = 1+ recMaxDepth(node.getRight());
	
	return Math.max(l_SubTree_length, r_SubTree_length);
}
}
