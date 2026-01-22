package Arrays;

import java.util.Scanner;

public class SubwithMaxzero {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        int k=in.nextInt(); //size of window
        int max=0;
        int index=0;
        for(int i=0;i<=n-k;i++){
            int count=0;
        	for(int j=i;j<i+k;j++){
        		if (a[j]==0){
        			count++;
        		}
        		if (count>max){
        			max=count;
        			index=i;	
        		}
        	}
        }
        for(int i=index;i<index+k;i++) {
        	System.out.print(a[i]+" ");
        }
	}
}
