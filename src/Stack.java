
public class Stack {
	private int ptr;
	private int stack[] = new int[10]; //testing stack
	
	public void fillTestData() {
		this.ptr = 4;
		stack[0] = 3;
		stack[1] = 6;
		stack[2] = 5;
		stack[3] = 2;
		stack[4] = 70;
	}
	public void push(int i) {
                if (isFull()){
                    System.out.println("Stack penuh!");
                
                } else {
                System.out.println("Data : " + i);
                stack[++ptr] = i;
                }
        }
	public int pop() {
		if(!this.isEmpty()) {
			return stack[ptr--];
		} else {
			System.out.println("Stack kosong");
			return -1;
		}
		
	}
	public int peek() {
                if(!this.isEmpty()){
                    return stack[ptr];
                } else {
                    return -1;
                }
        }
	public void clear() {
		while(!this.isEmpty()) {
			this.pop();
		}
		System.out.println("stack baru telah dibuat");
	}
	public void isFull() {
		
	}
	private boolean isEmpty() {
		return (ptr == -1);
	}
	public int[] getStack(){
		return this.stack;
	}
	public int getPtr(){
		return this.ptr;
	}
}
