package Arrays;

import java.util.Scanner;

public class SecondMax {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        int max=a[0];
        int max2=a[0];
        for(int i=1;i<n;i++) {
        	if (a[i]>max) {
        		max2=max;
        		max=a[i];
        	}
        	else if(a[i]<max && a[i]>max2){
        		max2=a[i];
        	}
        }
        System.out.println(max);
        System.out.println(max2);
	}
}
