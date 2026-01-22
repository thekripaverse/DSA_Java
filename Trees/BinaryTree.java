package Trees;
//Binary Search Tree
class Node{
	int data;
	Node left, right;
	public Node(int val) {
		data=val;
		left=right=null;
	}
}
public class BinaryTree {
	Node root;
	public void insert(int v) {
		Node newnode=new Node(v);
		if(root==null) {
			root=newnode;
			return;
		}
		Node t=root;
		Node p=null;
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
	public void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public void postorder(Node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	public static void main(String[] args) {
		BinaryTree ob=new BinaryTree();
		ob.insert(8);
		ob.insert(3);
		ob.insert(10);
		ob.insert(1);
		ob.insert(6);
		ob.insert(14);
		ob.insert(4);
		ob.insert(7);
		ob.insert(13);
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
