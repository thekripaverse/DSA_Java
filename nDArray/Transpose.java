package nDArray;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int a[][]=new int[n][m];
        for (int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		a[i][j]=in.nextInt();
        	}
        }
        int t[][]=new int[m][n];
        for (int i=0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		t[i][j]=a[j][i];
        	}
        }
        for (int i=0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(t[i][j]+" ");
        	}
        	System.out.println();
        }
	}
}
