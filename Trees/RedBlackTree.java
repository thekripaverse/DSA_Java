package Trees;
import java.util.*;
class Nodec 
{
    int data;
    Nodec left , right;
    boolean color;
    public Nodec(int val)
    {
        data = val;
        left = right = null;
        color = true;
    }
}
public class RedBlackTree{
	    boolean red = true , black = false;
	    Nodec root;
	    public void inorder(Nodec root) {
			if(root==null) {
				return;
			}
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	    public Nodec leftrotate(Nodec t)
	    {
	        Nodec x = t.right;
	        t.right = x.left;
	        x.left = t;
	        
	        x.color = t.color;
	        t.color = red;
	        return x;
	    }
	     public Nodec rightrotate(Nodec t)
	    {
	        Nodec x = t.left;
	        t.left = x.right;
	        x.right = t;
	        
	        x.color = t.color;
	        t.color = red;
	        return x;
	    }
	    
	    public void flipcolor(Nodec t)
	    {
	        t.color = red;
	        t.left.color = black;
	        t.right.color = black;
	    }
	    
	    public boolean isred(Nodec t)
	    {
	        return t != null && t.color == red;
	    }
	    public void insert(int v)
	    {
	        root = insert(root,v);
	        root.color = black;
	    }
	    public Nodec insert(Nodec t , int v)
	    {
	        if(t==null)
	        {
	            return new Nodec(v);
	        }
	        if(v<t.data)
	        {
	            t.left = insert(t.left , v);
	        }
	        else if(v>t.data)
	        {
	            t.right = insert(t.right,v);
	        }
	        
	        if(isred(t.right) && !isred(t.left))
	        {
	            t = leftrotate(t);
	        }
	        if(isred(t.left) && isred(t.left.left))
	        {
	            t = rightrotate(t);
	        }
	        if(isred(t.left) && isred(t.right))
	        {
	            flipcolor(t);
	        }
	        return t;
	        
	    }
	    public static void main(String[] args) {
			RedBlackTree ob=new RedBlackTree();
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
	    }
	    
	}
