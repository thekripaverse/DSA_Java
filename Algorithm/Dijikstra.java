package Algorithm;

public class Dijikstra {
	    static int max = Integer.MAX_VALUE;
	    
	    public static void diji(int a[][],int s)
	    {
	        int v = a.length;
	        int d[] = new int[v];
	        boolean visited[] = new boolean[v];
	        
	        for(int i=0;i<v;i++)
	        {
	            d[i] = max;
	            visited[i] = false;
	        }
	        d[s] = 0;
	        for(int i=0;i<v-1;i++)
	        {
	            // u is vertex contains min distance
	            int u = min_dist(d,visited);//initially u=0
	            visited[u] = true;
	            
	            for(int j=0;j<v;j++)
	            {
	                if(!visited[j] && a[u][j] !=0 && d[u]!= max && d[u]+a[u][j]<d[j])
	                {
	                    d[j]  = d[u] + a[u][j];//update the curr or shortest distance
	                }
	               
	            }
	        }
	        print(d);
	        
	    }
	    
	     public static int min_dist(int d[], boolean visited[]) {

	        int min = max;
	        int min_ind = -1;

	        for (int i = 0; i < d.length; i++) {
	            if (!visited[i] && d[i] < min) {
	                min = d[i];
	                min_ind = i;
	            }
	        }
	        return min_ind;
	    }
	    public static void print(int d[]) 
	    {
	        for(int i=0;i<d.length;i++)
	        {
	            System.out.println(d[i]+"--> "+i);
	        }
	        
	    }
	    public static void main(String[] args)
	    {
	        int a[][] = {
	            { 0,2,0,0,1},
	            { 2,0,3,0,0},
	            { 0,3,0,6,2},
	            { 0,0,6,0,4},
	            { 1,0,2,4,0}
	            
	        };
	        diji(a,0);
	    }
}
