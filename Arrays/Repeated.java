package Arrays;

import java.util.Scanner;

public class Repeated {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        boolean v[]=new boolean[n]; //visited array
        for(int i=0;i<n;i++) {
        	if(v[i]) {
        		continue;
        	}
        	int c=1;
        	for (int j=i+1;j<n;j++) {
        		if (a[i]==a[j]){
        			c++;
        			v[j]=true;
        		}
        	}
        	if(c>1) {
        		System.out.println(a[i]+" ");
        	}
        }
	}
}
