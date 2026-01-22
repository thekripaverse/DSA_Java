package Stack;

class Main{
	int n;
	int a[];
	int top;
	public Main(int size) {
		n=size;
		a=new int[n];
		top=-1;
	}
	public boolean isfull() {
		return top==n-1;
	}
	public boolean isempty() {
		return top==-1;
	}
	public void push(int v) {
		if(isfull()) {
			System.out.println("Stack Overflow");
			return;
		}
		top++;
		a[top]=v;
	}
	public int pop() {
		if(isempty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int result=a[top];
		top--;
		return result;
	}
	public int peek() {
		if(isempty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return a[top];
	}
}
public class Stack{
	public static void main(String[] args) {
		Main ob=new Main(10);
		System.out.println(ob.peek());
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(10);
		ob.push(23);
		System.out.println(ob.peek());
		System.out.println(ob.pop());
		System.out.println(ob.peek());
	}
}
