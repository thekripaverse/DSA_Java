package nDArray;

import java.util.Scanner;

public class Diagonal_zero {
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
        for (int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if (i==j||j==n-i-1) {
        			a[i][j]=0;
        		}
        	}
        }
        for (int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
	}
}
