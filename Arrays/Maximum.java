package Arrays;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        int max=a[0];
        for(int i=1;i<n;i++) {
        	if (a[i]>max) {
        		max=a[i];
        	}
        }
        System.out.println(max);
        int min=a[0];
        for(int i=1;i<n;i++) {
        	if (a[i]<min) {
        		max=a[i];
        	}
        }
        System.out.println(min);
	}
}
