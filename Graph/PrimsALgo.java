package Graph;
import java.util.*;
class PrimsALgo
{
	public static void prims(int g[][])
	{
		int vertices = g.length;
		int p[] = new int[vertices];//connected vertices
		int w[] = new int[vertices];//tot weight
		boolean v[] = new boolean[vertices];//visited vertices

		for(int i=0; i<vertices; i++)
		{
			w[i] = Integer.MAX_VALUE;
			v[i] = false;
		}

		w[0] =0;
		p[0] = -1;

		for(int i=0; i<vertices-1; i++) //count of a edges is i
		{

			int u = minweight(w,v);

			v[u] = true;

			for(int j=0; j<vertices; j++)
			{
				if(g[u][j] != 0 && !v[j] && g[u][j]<w[j])
				{
					p[j]=u;
					w[j] = g[u][j];
				}

			}

		}

		print(p,g);




	}
	public static int minweight(int w[],boolean v[])
	{
		int min = Integer.MAX_VALUE;
		int min_ind = -1;

		for(int i=0; i<w.length; i++)
		{
			if(!v[i] && w[i]<min)
			{
				min = w[i];
				min_ind = i;
			}
		}
		return min_ind;
	}

	public static void print(int p[],int g[][])
	{
		int total=0;
		for(int i=1; i<g.length; i++)
		{
			total+=g[i][p[i]];
			System.out.println(p[i]+"->"+i+" "+g[i][p[i]]);
		}
		System.out.println("Total Weight : "+total);
	}

	public static void main(String[] args)
	{
		int g[][] = {
			{0	,2,	0,	6,	0},
			{2	,0,	3,	8,	5},
			{0,3,	0,	0,	7},
			{6	,8,	0,	0,	9},
			{0	,5,	7,	9,	0}

		};

		prims(g);

	}
}
