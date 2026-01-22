package Arrays;

import java.util.Scanner;

public class Evenfirst {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        int even=0;
        for (int i=0;i<n;i++) {
        	if(a[i]%2==0) {
        		even++;
        	}
        }
        int e[]=new int[even];int x=0;
        for(int i=0;i<n;i++) {
        	if(a[i]%2==0) {
        		e[x++]=a[i];
        	}
        }
        for (int i=0;i<e.length;i++) {
        	System.out.print(e[i]+" ");
        }
        for (int i=0;i<n;i++) {
        	if(a[i]%2!=0) {
        		System.out.print(a[i]+" ");
        }
        } 
        
	}
}
