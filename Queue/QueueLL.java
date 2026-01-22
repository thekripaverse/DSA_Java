package Queue;
class Node{
	int data;
	Node next;
	public Node(int val) {
		data=val;
		next=null;
	}
}
public class QueueLL {
	Node front=null;
	Node rear=null;
	public boolean isEmpty() {
		return front==null;
	}
	public void enqueue(int v) {
		Node newnode=new Node(v);
		if(isEmpty()) {
			front=rear=newnode;
			rear.next=front;
			return;
		}
		rear.next=newnode;
		rear=newnode;
		rear.next=front;
	}
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		}
		int res=front.data;
		if(front==rear) {
			front =rear=null;
		}
		front=front.next;
		rear.next=front;
		return res;
	}
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return front.data;
	}
	public static void main(String[] args) {
		QueueLL ob=new QueueLL();
		ob.enqueue(57);
		ob.enqueue(58);
		ob.enqueue(59);
		System.out.println(ob.peek());
		System.out.println(ob.dequeue());
		System.out.println(ob.peek());
	}
}
