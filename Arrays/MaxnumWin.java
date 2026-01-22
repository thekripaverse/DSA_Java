package Arrays;

import java.util.Scanner;

public class MaxnumWin {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        int k=in.nextInt(); //size of window
        int max=0;
        for(int i=0;i<=n-k;i++){
        	for(int j=i;j<i+k;j++){
        		if(a[j]>max) {
        			max=a[j];
        		}
        	}
        	System.out.print(max+" ");
        }
	}
}
