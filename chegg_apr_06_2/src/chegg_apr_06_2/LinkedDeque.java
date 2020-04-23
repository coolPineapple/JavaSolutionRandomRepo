package chegg_apr_06_2;

public class LinkedDeque<T> implements DequeInterface<T> {
	private DoubleLinkedNode firstNode; // References node at front of deque
	private DoubleLinkedNode lastNode; // References node at back of deque
	// TODO Project 1A
	// define numberOfElements instance variable
	// implement ability to get the size of the collection: constructor, addToBack,
	// addToFront,
	// removeFront, removeBack, clear methods need to be modified accordingly

	public LinkedDeque() {
		this.firstNode = null;
		this.lastNode = null;
	} // end default constructor

	public void addToBack(T newEntry) {
		DoubleLinkedNode newNode = new DoubleLinkedNode(this.lastNode, newEntry, null);
		if (isEmpty())
			this.firstNode = newNode;
		else
			this.lastNode.next = newNode;
		this.lastNode = newNode;
	} // end addToBack

	public void addToFront(T newEntry) {
		DoubleLinkedNode newNode = new DoubleLinkedNode(null, newEntry, this.firstNode);
		if (isEmpty())
			this.lastNode = newNode;
		else
			this.firstNode.previous = newNode;
		this.firstNode = newNode;
	} // end addToFront

	public T getBack() throws EmptyQueueException {
		if (isEmpty())
			throw new EmptyQueueException("the collection is empty");
		return this.lastNode.data;
	} // end getBack

	public T getFront() throws EmptyQueueException {
		if (isEmpty())
			throw new EmptyQueueException("the collection is empty");
		return this.firstNode.data;
	} // end getFront

	public T removeFront() {
		T front = getFront(); // Might throw EmptyQueueException
		assert (this.firstNode != null);
		this.firstNode = this.firstNode.next;
		if (this.firstNode == null)
			this.lastNode = null;
		else
			this.firstNode.previous = null;
		return front;
	} // end removeFront

	public T removeBack() {
		T back = getBack(); // Might throw EmptyQueueException
		assert (this.lastNode != null);
		this.lastNode = this.lastNode.previous;
		if (this.lastNode == null)
			this.firstNode = null;
		else
			this.lastNode.next = null;
		return back;
	} // end removeBack

	public void clear() {
		this.firstNode = null;
		this.lastNode = null;
	} // end clear

	public boolean isEmpty() {
		return (this.firstNode == null) && (this.lastNode == null);
	} // end isEmpty

	public int getNumberOfElements() {
		// TODO Project 1A
		return 0; // THIS IS A STUB
	}

	public void display() {
		// TODO Project 1A
	}

	private class DoubleLinkedNode {
		private T data; // Deque entry
		private DoubleLinkedNode next; // Link to next node
		private DoubleLinkedNode previous; // Link to previous node

		private DoubleLinkedNode(T dataPortion) {
			this(null, dataPortion, null);
		} // end constructor

		private DoubleLinkedNode(DoubleLinkedNode previousNode, T dataPortion, DoubleLinkedNode nextNode) {
			this.data = dataPortion;
			this.next = nextNode;
			this.previous = previousNode;
		} // end constructor
	} // end DoubleLinkedNode
} // end LinkedDeque

/**
 * 
 * A class of stacks whose entries are stored in a deque.
 *
 * 
 * 
 */
