package Arrays;

import java.util.Scanner;

public class Oddrev {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        int odd=0;
        for (int i=0;i<n;i++) {
        	if(a[i]%2!=0) {
        		odd++;
        	}
        }
        int o[]=new int[odd];int x=0;
        for(int i=0;i<n;i++) {
        	if(a[i]%2!=0) {
        		o[x++]=a[i];
        	}
        }
        rev(o,odd);
        int res[]=new int[n];int z=0;
        for(int i=0;i<n;i++) {
        	if(a[i]%2!=0) {
        		res[i]=o[z++];
        	}
        	else {
        		res[i]=a[i];
        	}
        }
        for (int i=0;i<n;i++) {
        	System.out.print(res[i]+"\t");
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
