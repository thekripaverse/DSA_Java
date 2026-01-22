package nDArray;

import java.util.Scanner;

public class Boundary {
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
        int top=0,left=0,bottom=n-1,right=n-1;
        if(top<=bottom && left<=right) {
        	for(int i=left;i<=right;i++) {
        		System.out.print(a[top][i]+" ");
        	}
        	top++;
        	for(int i=top;i<=bottom;i++) {
        		System.out.print(a[i][right]+" ");
        	}
        	right--;
        	if (left<=right) {
        		for(int i=right;i>=left;i--) {
        			System.out.print(a[bottom][i]+" ");
        		}
        		bottom--;
        	}
        	if(top<=bottom) {
        		for(int i=bottom;i>=top;i--) {
        			System.out.print(a[i][left]+" ");
        		}
        		left++;
        	}
        }
	}
}
