public class StackOperations {

	private int[] data;
	private int top;
	public static final int Default_Capacity = 10;

	public StackOperations() throws Exception {
		this(Default_Capacity);
	}

	public StackOperations(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("Invalid Capacity");

		}
		this.data = new int[capacity];
		this.top = -1;
	}
//only display function time complexity is O(n) and other all functions have O(1)
	public int size() {
		return this.top + 1;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int value) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Stack is full");
		}

		this.top++;
		this.data[this.top] = value;
	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty");
		}
		int v = this.data[this.top];
		this.data[this.top] = 0;
		this.top--;
		return v;
	}

	public int top() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty");
		}
		int v = this.data[this.top];
		return v;
	}

	public void display() {
		for (int i = this.top; i >= 0; i--) {
			System.out.print(this.data[i] + " ,");
		}
		System.out.println("END");
	}

	public static void main(String[] args) throws Exception {
		StackOperations stack = new StackOperations();
		for (int i = 1; i <= 10; i++) {
			stack.push(i * 10);
			stack.display();
		}
		System.out.println(stack.size());

	}

}
