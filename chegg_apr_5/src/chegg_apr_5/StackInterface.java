package chegg_apr_5;

public interface StackInterface<T> {
	//Puts entry on top of the stack
		public void push(T newEntry);

	//Takes entry off the top of the stack and returns that entry
	//Returns NULL in the empty stack scenario
		public T pop();

	//Returns a reference to the entry on the top of the stack but does not remove it
	//Returns NULL in the empty stack scenario
		public T peek();

	//Returns true if the stack is empty, false if not
		public boolean isEmpty();

	//clears the stack
		public void clear();
	}
	// End of StackInterface.java
	//Code for QueueInterface.java
