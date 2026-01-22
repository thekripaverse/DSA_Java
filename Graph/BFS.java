package Graph;
//bfs
import java.util.*;
public class BFS{
    int vertices;
    LinkedList<Integer>[] a;
    public BFS(int v){
  	  vertices=v;
  	  a=new LinkedList[v];
  	  for(int i=-0;i<v;i++) {
  		  a[i]=new LinkedList<>();  	  }
    }
    public void edges(int u,int v) {
  	  a[u].add(v);
  	  a[v].add(u);
  	  
    }
    public void print() {
  	  for(int i=0;i<vertices;i++) {
  		  for(int j:a[i]) {
  			  System.out.print(j+" ");
  		  }
  		  System.out.println();
  	  }
    }
    public void Bfs(int s) {
  	  boolean v[]=new boolean[vertices];
  	  Queue<Integer> x=new LinkedList<>();
  	  v[s]=true;
  	  x.add(s);
  	  while(!x.isEmpty()) {
  		  int n=x.poll();
  		  System.out.print(n);
  		  for(int i: a[n]) {
  			  if(!v[i]) {
  				  v[i]=true;
  				  x.add(i);
  			  }
  			 
  		  }
  	  }
    }
    public void Dfs(int s) {
  	  boolean v[]=new boolean[vertices];
  	  Stack<Integer> x=new Stack<>();
  	  x.push(s);
  	  while(!x.isEmpty()) {
  		  int n=x.pop();
  		  if(!v[n]) {
  			  v[n]=true;
  			  System.out.print(n+" ");
  			  LinkedList<Integer> y=a[n];
  			  for(int i=y.size()-1;i>=0;i--) {
  				  int z=y.get(i);
  				  if(!v[z]) {
  					  x.push(z);
  				  }
  			  }
  			 
  		  }
  	  }
    }
    public static void main(String[] args) {
  		BFS ad=new BFS(5);
  		
  		ad.edges(0,1);
  		ad.edges(0,2);
  		ad.edges(1,3);
  		ad.edges(2,4);
  		ad.Bfs(0);
  		System.out.println();
  		ad.print();
  	    ad.Dfs(0);

}}
