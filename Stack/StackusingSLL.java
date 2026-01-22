package Stack;
class Node{
	int data;
	Node next;
	public Node(int v) {
		data=v;
		next=null;
	}
}
public class StackusingSLL {
	Node top;
	public void push(int v) {
		Node newnode=new Node(v);
		if(top==null) {
			top=newnode;
			return;
		}
		newnode.next=top;
		top=newnode;
	}
	public int pop() {
		if(top.next==null) {
			return top.data;
		}
		int result=top.data;
		top=top.next;
		return result;
	}
	public int peek() {
		return top.data;
	}
	public static void main(String[] args) {
		StackusingSLL ob=new StackusingSLL();
		ob.push(10);
		ob.push(30);
		ob.push(24);
		ob.push(45);
		ob.push(76);
		System.out.println("Top:"+ob.peek());
		System.out.println("Deleting:"+ob.pop());
		System.out.println(ob.peek());
	}
}
