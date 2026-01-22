package Graph;
import java.util.*;
class KruskalsAlgo{
	static class edge implements Comparable<edge>{
		int u, v, w;
		edge(int u, int v, int w){
			this.u = u;
			this.v = v;
			this.w = w;
		}
		@Override
		public int compareTo(edge o){
			return this.w - o.w;
		}
	}
	public static int find(int p[], int x){
		if (p[x] == x)
			return x;
		return p[x] = find(p, p[x]);
	}
	public static void union(int p[], int r[], int a, int b){
		a = find(p, a);
		b = find(p, b);
		if (a != b){
			if (r[a] < r[b])
				p[a] = b;
			else if (r[a] > r[b])
				p[b] = a;
			else{
				p[b] = a;
				r[a]++;
			}
		}
	}
	public static void kruskals(int g[][]){
		int n = g.length;
		ArrayList<edge> e = new ArrayList<>();
		for (int i = 0; i < n; i++){
			for (int j = i + 1; j < n; j++){
				if (g[i][j] != 0){
					e.add(new edge(i, j, g[i][j]));
				}
			}
		}
		Collections.sort(e);
		int p[] = new int[n];//parent
		int r[] = new int[n];//rank
		for (int i = 0; i < n; i++){
			p[i] = i;
		}
		int weight = 0;
		for (edge i : e){
			int a = find(p, i.u);
			int b = find(p, i.v);
			if (a != b){
				System.out.println((i.u + 1) + " -- " + (i.v + 1) + " == " + (i.w));
				weight += i.w;
				union(p, r, a, b);
			}
		}
		System.out.println("Total Weight = " + weight);
	}
	public static void main(String[] args){
		int g[][] = {
			{0,2,0,6,0},
			{2,0,3,8,5},
			{0,3,0,0,7},
			{6,8,0,0,9},
			{0,5,7,9,0}
		};
		kruskals(g);
	}
}