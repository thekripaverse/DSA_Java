package Arrays;

import java.util.Scanner;

public class UniqueElement {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++) {
        	int c=0;
        	for (int j=0;j<n;j++) {
        		if (a[i]==a[j]){
        			c++;
        		}
        	}
        	if(c==1) {
        		System.out.println(a[i]+" ");
        	}
        }
	}

}
