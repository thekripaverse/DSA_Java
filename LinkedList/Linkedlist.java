package LinkedList;

class Node{
	int data;
	Node next; //global declaration
	public Node(int val) {
		data=val;
		next=null;
	}
}
class Linkedlist {
	Node head;
	public void insertatbeg(int v) {
		Node newnode=new Node(v);
		if(head==null) {
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	public void insertatend(int v) {
		Node newnode=new Node(v);
		if(head==null) {
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.next=null;
	}
	
	public void insertatpos(int v,int pos) {
		Node newnode=new Node(v);
		if (pos==0) {
			insertatbeg(v);
			return;
		}
		Node temp=head;
		int c=0;
		while(temp.next!=null && c<pos-1) {
			temp=temp.next;
			c++;
		}
		newnode.next=temp.next;
		temp.next=newnode;		
	}
	public void searchatpos(int v) {
		Node temp=head;
		int pos=0;
		while(temp!=null) {
			if (temp.data==v) {
				System.out.println("Found"+" "+pos);
			}
			temp=temp.next;
			pos++;
		}
	}
	public void rev() {
		Node temp=head;
		Node next=null;
		Node prev=null;
		while(temp!=null) {
			next=temp.next;
			temp.next=prev;
			prev=temp;
			temp=next;
		}
		head=prev;
	}
	public void deleteatpos(int pos) {
		if(pos==0) {
			head=head.next;
		}
		Node temp=head;
		int c=0;
		while(temp.next!=null && c<pos-1) {
			temp=temp.next;
			c++;
		}
		temp.next=temp.next.next;
		
	}
	public void merge(Linkedlist ob,Linkedlist ob1) {
		Node temp=ob.head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=ob1.head;
		temp=ob.head;
		while(temp.next!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.print("null");
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		Linkedlist ob=new Linkedlist();
		Linkedlist ob1=new Linkedlist();
		ob.insertatbeg(3);
		ob.insertatbeg(2);
		ob.insertatbeg(1);
		ob.insertatend(4);
		ob.insertatend(5);
		ob.insertatpos(6,3);
		ob.display();
		ob.deleteatpos(3);
		ob1.insertatbeg(30);
		ob1.insertatbeg(20);
		ob1.insertatbeg(10);
		ob1.insertatend(40);
		ob1.insertatend(50);
		ob.display();
		ob1.insertatpos(60,3);
		ob.display();
		ob.rev();
		ob.merge(ob, ob1);
	}
}

