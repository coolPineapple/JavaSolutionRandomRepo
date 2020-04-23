package chegg_apr_5;

public class Stack<T> implements StackInterface<T> {
	LinkedList<T> myList;
	

	/**
	 * @param myList
	 */
	public Stack() {
		super();
		myList = new LinkedList<T>();
	}

	@Override
	public void push(T newEntry) {
		myList.addToFront(newEntry);;
		
		
	}

	@Override
	public T pop() {
		if(myList.getLength() < 0) {
			return null;
		}
		return myList.removeFromFront();
		
		
	}

	@Override
	public T peek() {
		return myList.getFrontData();
		
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
// End of Stack.java
//Code for Queue.java