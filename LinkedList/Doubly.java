package LinkedList;

class Node1 {
	int data;
	Node1 prev;
	Node1 next;

	public Node1(int val) {
		data = val;
		next = prev = null;
	}
}

public class Doubly {
	Node1 head;

	public void insertAtBeg(int v) {
		Node1 newNode = new Node1(v);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	public void insertAtEnd(int v) {
		Node1 newNode = new Node1(v);
		if (head == null) {
			head = newNode;
			return;
		}
		Node1 temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}

	public void insertAtPosition(int v, int pos) {
		Node1 newNode = new Node1(v);
		if (pos == 0) {
			insertAtBeg(v);
			return;
		}
		Node1 temp = head;
		int c = 0;
		while (temp.next != null && c < pos - 1) {
			temp = temp.next;
			c++;
		}
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next.prev = newNode.next;
		temp.next = newNode;
	}

	public void deleteAtPosition(int pos) {
		if (pos == 0) {
			head = head.next;
			head.prev = null;
			return;
		}
		Node1 temp = head;
		int c = 0;
		while (temp.next != null && c < pos - 1) {
			temp = temp.next;
			c++;
		}
		if (temp.next == null) {
			temp = null;
			return;
		}
		temp.next = temp.next.next;

	}

	public void search(int d) {
		Node1 temp = head;
		int c = 0;
		while (temp != null) {
			if (temp.data == d) {
				System.out.println("Found at " + c);
				return;
			} else {
				temp = temp.next;
				c++;
			}
		}
	}

	public void display() {
		Node1 temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void reverse() {
	    Node1 temp = null;
	    Node1 current = head;
	    while (current != null) {
	        temp = current.prev;
	        current.prev = current.next;
	        current.next = temp;
	        current = current.prev; 
	    }
	    if (temp != null) {
	        head = temp.prev;
	    }
	}

	public static void main(String[] args) {
		Doubly dll = new Doubly();
		Doubly dll1 = new Doubly();
		dll1.insertAtBeg(50);
		dll1.insertAtBeg(10);
		dll1.insertAtBeg(20);
		dll1.insertAtBeg(30);
		dll1.insertAtBeg(40);
		dll1.insertAtEnd(50);
		dll1.insertAtEnd(60);
		dll1.insertAtBeg(10);
		dll1.display();
		dll.insertAtBeg(20);
		dll.insertAtBeg(30);
		dll.insertAtBeg(40);
		dll.insertAtEnd(50);
		dll.insertAtEnd(60);
		dll.insertAtPosition(70, 3);
		dll.insertAtPosition(80, 1);
		dll.display();
		dll.deleteAtPosition(2);
		dll.display();
		dll.reverse();
		dll.search(50);

	}
}