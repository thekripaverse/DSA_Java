package nDArray;

import java.util.Scanner;

public class Rotate90deg {
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
        for (int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		t[m-j-1][i]=a[i][j];
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
