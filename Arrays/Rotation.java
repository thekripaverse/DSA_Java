package Arrays;

import java.util.Scanner;

public class Rotation {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
		rev(a,0,n-1);
		rev(a,0,k-1);
		rev(a,k,n-1);
        for(int i=0;i<n;i++) {
        	System.out.print(a[i]+"\t");
        }
		
	}
	public static void rev(int a[],int start, int end) {
		int temp=0;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		
	}
}
