package Patterns;

import java.util.Scanner;

public class Zigzag {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i=1;i<=n;i++){
        	if (i%2!=0) {
                for(int j=1;j<=n;j++){
                	System.out.print(((i-1)*n+j)+" ");
                }
        	}
        	else {
        		for(int j=n;j>=1;j--) {
        			System.out.print(((i-1)*n+j)+" ");
        		}
        	}
        	System.out.println();
        }
   }
}
