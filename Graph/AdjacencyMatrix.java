package Graph;

public class AdjacencyMatrix {
	int vertices;
	int a[][];
	
	public AdjacencyMatrix(int n){
	    vertices=n;
	    a=new int[n][n];
	}
	
	public void edges(int u,int v){
	    a[u][v]=1;//directed
	    a[v][u]=1;
	}
	
	public void print(){
	    for (int i=0;i<vertices;i++){
	        for (int j=0;j<vertices;j++){
	            System.out.print(a[i][j]+" ");
	            
	        }
	        System.out.println();
	    }
	}
	public static void main(String[] args){
		AdjacencyMatrix ob =new AdjacencyMatrix(5);
	    ob.edges(0,1);
	    ob.edges(0,2);
	    ob.edges(1,3);
	    ob.edges(2,4);
	    ob.print();
	    }
}
