package chegg_apr_5;

public class Queue<T> implements QueueInterface<T> {
	LinkedList<T> myList;
	

	/**
	 * @param myList
	 */
	public Queue(LinkedList<T> myList) {
		super();
		this.myList = myList;
	}

	@Override
	public void enqueue(T newEntry) {
		myList.addToEnd(newEntry);
		
	}

	@Override
	public T dequeue() {
		/* myList.getLength() < 0 means myList is empty*/
		if(myList.getLength() < 0) {
			return null;
		}
		return myList.removeFromFront();
	}

	@Override
	public T getFront() {
		myList.getFrontData();
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(myList.getLength() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		myList = null;
		
	}
}
// End of Queue.java
//Code for Student.java
