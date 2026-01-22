package LinkedList;

public class Circular {
	Node head;
	public void insertAtBeg(int v) {
		Node newNode = new Node(v);
		if (head == null) {
			head = newNode;
			newNode.next = head;
			return;
		}
		Node temp = head;
		while(temp.next!=head) {
			temp = temp.next;
		}
		newNode.next = head;
		head = newNode;
		temp.next = head;
	}
	
	public void insertAtEnd(int v) {
		Node newNode = new Node(v);
		if (head == null) {
			head = newNode;
			newNode.next = head;
			return;
		}
		Node temp = head;
		while(temp.next!=head) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.next = head;
	}
	
	public void insertAtPosition(int v,int pos) {
		Node newNode = new Node(v);
		if (pos==0) {
			insertAtBeg(v);
			return;
		}
		Node temp = head;
		int c = 0;
		while(temp.next!=head && c<pos-1) {
			temp=temp.next;
			c++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void deleteAtPosition(int pos) {
		if (pos==0) {
			if(head.next==head) {
				head = null;
				return;
			}
			Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next; 
            temp.next = head;
            return;
		}
		Node temp = head;
		int c = 0;
		while (c < pos - 1 && temp.next != head) {
            temp = temp.next;
            c++;
        }
        if (temp.next != head || (temp.next == head && c == pos - 1)) {
             if(temp.next == head) {
                 head = head.next;
             }
             temp.next = temp.next.next;
        }
	}
	
	public void search(int d) {
        if (head.data == d) {
            System.out.println("Found at 0");
            return;
        }
        Node temp = head.next;
        int c = 1;
        while (temp != head) {
            if (temp.data == d) {
                System.out.println("Found at " + c);
                return;
            }
            temp = temp.next;
            c++;
        }
        System.out.println("Not Found");
	}
	
	public void display() {
		Node temp = head.next;
		System.out.print(head.data + "->");
		while(temp !=head) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print(head.data);
		System.out.println();
	}
	
	public void reverse() {
		if (head == null || head.next == head) return;
        Node prev = head;
        Node current = head.next;
        Node nextNode;
        while (current != head) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        current.next = prev;
        head = prev;
	}
	
	public void merge(Circular s1,Circular s2) {
		if (s1.head == null) {
            s1.head = s2.head;
            return;
        }
        if (s2.head == null) return;
        Node temp1 = s1.head;
        while (temp1.next != s1.head) {
            temp1 = temp1.next;
        }
        Node temp2 = s2.head;
        while (temp2.next != s2.head) {
            temp2 = temp2.next;
        }
        temp1.next = s2.head;
        temp2.next = s1.head;
    }
	
	public static void main(String[] args) {
		Circular cll = new Circular();
		Circular cll1 = new Circular();
		cll1.insertAtBeg(50);
		cll1.insertAtBeg(10);
		cll1.insertAtBeg(20);
		cll1.insertAtBeg(30);
		cll1.insertAtBeg(40);

		cll1.insertAtBeg(10);
		cll1.display();
		cll.insertAtBeg(20);
		cll.insertAtBeg(30);
		cll.insertAtBeg(40);
		cll.insertAtEnd(50);
		cll.insertAtEnd(60);
		cll.insertAtPosition(70,3);
		cll.insertAtPosition(80,1);
		cll.deleteAtPosition(4);
		cll.display();
		cll.reverse();
		cll.display();
		cll.search(50);
		cll.merge(cll,cll1);
		cll.display();
	}
}
