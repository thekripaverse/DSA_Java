package Queue;
//Circular queue using array ADT
public class QueueADT {
	private int a[];
	private int front;
	private int rear;
	private int size;
	public QueueADT(int n) {
		a=new int[n];
		front = -1;
		rear=-1;
		size=n;
	}
	public boolean isEmpty() {
		return front==-1;
	}
	public boolean isFull() {
		return (front==0 && rear==size-1)|| (rear+1==front);
	}
	public void enqueue(int val) {
		if(isFull()) {
			System.out.print("Queue Overflow");
		}
		if(front==-1) {
			front=0;
		}
		rear=(rear+1)%size;
		a[rear]=val;
	}
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		}
		int res=a[front];
		if(front==rear) {
			front=rear=-1;
		}
		else {
			front=(front+1)%size;
		}
		return res;
	}
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return a[front];
	}
	public static void main(String[] args) {
		QueueADT ob=new QueueADT(5);
		System.out.println(ob.dequeue());
		ob.enqueue(75);
		ob.enqueue(76);
		ob.enqueue(77);
		System.out.println(ob.peek());
		System.out.println(ob.dequeue());
		System.out.println(ob.peek());
	}
}
