package Graph;
import java.util.*;
public class BFSmatrix {
    int vertices;
    int a[][];

    public BFSmatrix(int n) {
        vertices = n;
        a = new int[n][n];
    }

    public void edges(int u, int v) {
        a[u][v] = 1;  // undirected
        a[v][u] = 1;
    }

    public void print() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Bfs(int s) {
        boolean visited[] = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int i = 0; i < vertices; i++) {
                if (a[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        System.out.println();
    }

    public void Dfs(int s) {
        boolean visited[] = new boolean[vertices];
        Stack<Integer> st = new Stack<>();
        st.push(s);

        while (!st.isEmpty()) {
            int node = st.pop();
            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");
                for (int i = vertices - 1; i >= 0; i--) {
                    if (a[node][i] == 1 && !visited[i]) {
                        st.push(i);
                    }
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	BFSmatrix ob = new BFSmatrix(5);
        ob.edges(0, 1);
        ob.edges(0, 2);
        ob.edges(1, 3);
        ob.edges(2, 4);
        ob.print();

        System.out.println("BFS");
        ob.Bfs(0);

        System.out.println("DFS");
        ob.Dfs(0);
    }
}
