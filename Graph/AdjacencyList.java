package Graph;
import java.util.*;
public class AdjacencyList {
	int vertices;
	LinkedList<Integer>[] a;
	
	public AdjacencyList(int v){
	    vertices=v;
	    a=new LinkedList[v];
	    
	    for(int i=0;i<v;i++){
	        a[i]=new LinkedList<>();
	    }
	}
	
	public void edges(int u,int v){
	    a[u].add(v);
	    a[v].add(v);
	}
	
	public void print(){
	    for (int i=0;i<vertices;i++){
	        for (int j:a[i]){
	            System.out.print(j+" ");
	            
	        }
	        System.out.println();
	    }
	}
	public static void main(String[] args){
	    AdjacencyList ob =new AdjacencyList(5);
	    ob.edges(0,1);
	    ob.edges(0,2);
	    ob.edges(1,3);
	    ob.edges(2,4);
	    ob.print();
	    }
}
