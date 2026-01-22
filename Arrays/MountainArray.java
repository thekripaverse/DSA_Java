package Arrays;

import java.util.Scanner;

public class MountainArray {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int mount=0;
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        for (int i=1;i<n-1;i++) {
        	if(a[i]>a[i-1] && a[i]<a[i+1]) {
        		mount+=1;
        	}
        }
        System.out.print(mount);
	}
}
