package Arrays;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        rev(a,n);
        for(int i=0;i<n;i++) {
        	System.out.print(a[i]+"\t");
        }
	}
	public static void rev(int a[],int n) {
		int start=0, end=n-1, temp=0;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		
	}
}
