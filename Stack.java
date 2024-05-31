package package1;

public class Stack {
	Node top;

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}

	public int pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		int popped = top.data;
		top = top.next;
		return popped;
	}

	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Top of the stack: " + stack.peek());
		stack.pop();
		System.out.println("Top of the stack: " + stack.peek());
		stack.pop();
		stack.pop();
		System.out.println("Stack is empty: " + stack.isEmpty());
	}
}
