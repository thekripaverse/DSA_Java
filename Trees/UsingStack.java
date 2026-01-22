package Trees;
import java.util.*;
class Node1{
	int data;
	Node1 left, right;
	public Node1(int val) {
		data=val;
		left=right=null;
	}
}
public class UsingStack {
	Node1 root;
	public void insert(int v) {
		Node1 newnode=new Node1(v);
		if(root==null) {
			root=newnode;
			return;
		}
		Node1 t=root;
		Node1 p=null;
		while(t!=null) {
			p=t;
			if(v<t.data) {
				t=t.left;
			} else {
				t=t.right;
			}
		}
		if(v<p.data) {
			p.left=newnode;
		} else {
			p.right=newnode;
		}
	}
	public boolean Search(Node1 root,int v) {
		if(root==null) {
			return false;
		}
		if(v<root.data) {
			return Search(root.left,v);
			
		}
		return Search(root.right,v);
	}
	public void delete(Node1 root,int v) {
		if(root==null) {
			
		}
	}
	public void inorder(Node1 root) {
		Stack<Node1> s=new Stack<>();
		Node1 t=root;
		while(t!=null || !s.isEmpty()) {
			while(t!=null) {
				s.push(t);
				t=t.left;
			}
			t=s.pop();
			System.out.print(t.data+" ");
			t=t.right;
		}
	}
	public void preorder(Node1 root) {
		if(root==null) {
			return;
		}
		Stack<Node1> s=new Stack<>();
		s.push(root);
		while(!s.isEmpty()) {
			Node1 t=s.pop();
			System.out.print(t.data+" ");
			if(t.right!=null) {
				s.push(t.right);
			}
			if(t.left!=null) {
				s.push(t.left);
			}
		}
	}
	public void postorder(Node1 root) {
		if(root==null) {
			return;
		}
		Stack<Node1> s1=new Stack<>();
		Stack<Node1> s2=new Stack<>();
		s1.push(root);
		while(!s1.isEmpty()) {
			Node1 t=s1.pop();
			s2.push(t);
			if(t.left!=null) {
				s1.push(t.left);
			}
			if(t.right!=null) {
				s1.push(t.right);
			}
		}
		while(!s2.empty()) {
			Node1 t=s2.pop();
			System.out.print(t.data+" ");
		}
	}
	public static void main(String[] args) {
		UsingStack ob=new UsingStack();
		ob.insert(8);
		ob.insert(3);
		ob.insert(10);
		ob.insert(1);
		ob.insert(6);
		ob.insert(14);
		ob.insert(4);
		ob.insert(7);
		ob.insert(13);
		System.out.println(ob.Search(ob.root, 13));
		System.out.println("Inorder");
		ob.inorder(ob.root);
		System.out.println();
		System.out.println("Preorder");
		ob.preorder(ob.root);
		System.out.println();
		System.out.println("Postorder");
		ob.postorder(ob.root);
		System.out.println();
	}
}
