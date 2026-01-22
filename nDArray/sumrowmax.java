package nDArray;

import java.util.Scanner;

public class sumrowmax {
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
        int max=0;
        for (int i=0;i<n;i++) {
        	int sum=0;
        	for(int j=0;j<m;j++) {
        		sum+=a[i][j];
        	}
        	max=Math.max(max, sum);
        }
        System.out.print(max);
	}
}
