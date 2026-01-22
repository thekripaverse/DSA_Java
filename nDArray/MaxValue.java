package nDArray;

import java.util.Scanner;

public class MaxValue {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int a[][]=new int[n][m];
        int max=0;
        for (int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		a[i][j]=in.nextInt();
        		if (a[i][j]>max){
        			max=a[i][j];
        		}
        	}
        }
        System.out.print(max);
	}
}
