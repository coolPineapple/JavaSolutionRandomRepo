package chegg_apr_06_2;

public class DropoutStack {
	// TODO Project 1B
	// IMPLEMENT ALL THE METHODS DEFINED IN THE UML DIAGRAM
	public DropoutStack(int initialCapacity) {
		// TODO Project 1B
	} // end constructor

	public void push(T newEntry) {
		// TODO Project 1B
	} // end push

	public T peek() {
		// TODO Project 1B
		return null; // THIS IS A STUB
	} // end peek

	public T pop() {
		// TODO Project 1B
		return null; // THIS IS A STUB
	} // end pop

	public boolean isEmpty() {
		// TODO Project 1B
		return true; // THIS IS A STUB
	} // end isEmpty

	public void clear() {
		// TODO Project 1B
	} // end clear

	public void display() {
		// TODO Project 1B
	}

	public static void main(String args[]) {
		System.out.println("************** TESTING DROPOUT STACK **************\n");
		final int STACK_CAPACITY = 20;
		DropoutStack dropoutStack = new DropoutStack<>(STACK_CAPACITY);
		System.out
				.println("----> Adding " + STACK_CAPACITY + " items to empty stack with capacity of " + STACK_CAPACITY);
		for (int i = 1; i <= STACK_CAPACITY; i++) {
			dropoutStack.push(i);
		}
		System.out.println("----> The content of the stack is:");
		dropoutStack.display();
		System.out.println("----> The top of the stack is: " + dropoutStack.peek());
		System.out.println("\n----> Adding 5 more items to full stack");
		for (int i = STACK_CAPACITY + 1; i <= STACK_CAPACITY + 5; i++) {
			System.out.println("push " + i);
			dropoutStack.push(i);
		}
		System.out.println("----> The content of the stack is:");
		dropoutStack.display();
		System.out.println("----> The top of the stack is: " + dropoutStack.peek());
		System.out.println("\n----> Removing all elements from the stack:");
		while (!dropoutStack.isEmpty()) {
			System.out.println("----> pop " + dropoutStack.pop());
		}
		dropoutStack.display();
		System.out.println("----> The top of the stack is: " + dropoutStack.peek());
		System.out.println("\n----> Trying to pop from the empty stack");
		System.out.println("----> Got back " + dropoutStack.pop());
		System.out.println("\n----> Trying to peek at the top of the empty stack");
		System.out.println("----> Got back " + dropoutStack.peek());
		System.out.println(
				"\n----> Adding " + (STACK_CAPACITY + 2) + " items to empty stack of capacity of " + STACK_CAPACITY);
		for (int i = 1; i <= STACK_CAPACITY + 2; i++) {
			dropoutStack.push(i);
		}
		System.out.println("----> The content of the stack is:");
		dropoutStack.display();
		System.out.println("\n----> Clearing the stack with the clear method");
		dropoutStack.clear();
		System.out.println("----> The content of the stack is:");
		dropoutStack.display();
		System.out.println("\n----> Adding " + (STACK_CAPACITY + 1) + " items to the cleared stack with capacity of "
				+ STACK_CAPACITY);
		for (int i = 1; i <= STACK_CAPACITY + 1; i++) {
			dropoutStack.push(i);
		}
		System.out.println("----> The content of the stack is:");
		dropoutStack.display();
		System.out.println("----> The top of the stack is: " + dropoutStack.peek());
	}
}