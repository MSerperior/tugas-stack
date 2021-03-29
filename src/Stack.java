
public class Stack {
	int ptr;
	int stack[] = new int[10]; //testing stack
	
	public void fillTestData() {
		this.ptr = 4;
		stack[0] = 3;
		stack[1] = 6;
		stack[2] = 5;
		stack[3] = 2;
		stack[4] = 7;
	}
	public void push() {
		
	}
	public void pop() {
		if(!this.isEmpty()) {
			this.ptr--;
		} else {
			System.out.println("Stack sudah kosong");
		}
		
	}
	public void peek() {
		
	}
	public void clear() {
		while(!this.isEmpty()) {
			this.pop();
		}
	}
	public void isFull() {
		
	}
	public boolean isEmpty() {
		return true; // to be implemented
	}
}
