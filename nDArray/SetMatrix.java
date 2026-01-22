package nDArray;
import java.util.Scanner;
/*
public class SetMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int x = -1, y = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 0) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        if (x != -1 && y != -1) {
            setmat(n, m, a, x, y);
       }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] setmat(int n, int m, int[][] a, int x, int y) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (x == i || y == j) {
                    a[i][j] = 0;
                }
            }
        }
        return a;
    }
}
*/

/*public class SetMatrix{
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int a[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            a[i][j] = in.nextInt();
        }
    }
    boolean r=false,c=false;
    for(int i=0;i<n;i++) {
    	if(a[i][0]==0) {
    		c=true;
    	}
    }
    for(int i=0;i<m;i++) {
    	if(a[0][i]==0) {
    		r=true;
    	}
    }
    for(int i=1;i<n;i++) {
    	for(int j=1;j<m;j++) {
    		if(a[i][j]==0) {
    			a[i][0]=0;
    			a[0][j]=0;
    		}
    	}
    }
    for(int i=1;i<n;i++) {
    	for(int j=1;j<m;j++) {
    		if(a[i][0]==0||a[0][j]==0) {
    			a[i][j]=0;
    		}
    	}
    }
    if(r) {
    	for(int i=0;i<m;i++) {
    		a[0][i]=0;
    	}
    }
    if(c) {
    	for(int i=0;i<n;i++) {
    		a[i][0]=0;
    	}
    }
    for(int i=0;i<n;i++) {
    	for(int j=0;j<m;j++) {
    		System.out.print(a[i][j]);
    		}
    	System.out.println();
    	}
    }
}
*/
import java.util.Scanner;

public class SetMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                a[i][j] = in.nextInt();
            }
        }
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (a[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (rows[i] || cols[j]){
                    a[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}

