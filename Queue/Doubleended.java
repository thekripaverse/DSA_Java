package Queue;
class Node1{
	int data;
	Node1 next;
	Node1 prev;
	public Node1(int val) {
		data=val;
		next=null;
		prev=null;
	}
	
}
public class Doubleended {
	Node1 front;
	Node1 rear;
	public boolean isEmpty() {
		return front==null;
	}
	public void insertfront(int v) {
		Node1 newnode=new Node1(v);
		if(isEmpty()) {
			front=rear=newnode;
			rear.next=front;
			return;
		}
		newnode.next=front;
		front.prev=newnode;
		front=newnode;
	}
	public void insertrear(int v) {
		Node1 newnode=new Node1(v);
		if(isEmpty()) {
			front=rear=newnode;
			rear.next=front;
			return;
		}
		rear.next=newnode;
		newnode.prev=rear;
		rear=newnode;
	}
	public int removefront() {
		if(isEmpty()) {
			return -1;
		}
		int res=front.data;
		if(front==rear) {
			front=rear=null;
		}
		front=front.next;
		front.prev=null;
		return res;
	}
	public int removerear() {
		if(isEmpty()) {
			return -1;
		}
		int res=rear.data;
		if(front==rear) {
			front=rear=null;
		}
		rear=rear.prev;
		rear.next=null;
		return res;
	}
	public int peekfront() {
		if(isEmpty()) {
			return -1;
		}
		return front.data;
	}
	public int peekrear() {
		if(isEmpty()) {
			return -1;
		}
		return rear.data;
	}
	public static void main(String[] args) {
		Doubleended ob=new Doubleended();
		ob.insertfront(3);
		ob.insertfront(4);
		ob.insertrear(5);
		ob.insertrear(6);
		System.out.println(ob.peekfront());
		System.out.println(ob.peekrear());
		ob.removefront();
		ob.removerear();
		System.out.println(ob.peekfront());
		System.out.println(ob.peekrear());
	}
}
