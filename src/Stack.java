
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
	public int pop() {
		if(!this.isEmpty()) {
			this.ptr--;
			return stack[ptr];
		} else {
			System.out.println("Stack kosong");
			return -1;
		}
		
	}
	public void peek() {
		
	}
	public void clear() {
		while(!this.isEmpty()) {
			this.pop();
		}
		System.out.println("stack baru telah dibuat");
	}
	public void isFull() {
		
	}
	public boolean isEmpty() {
		return (ptr == -1);
	}
}
