package Arrays;

import java.util.Scanner;

public class MaxofSumSubarray {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        int k=in.nextInt(); //size of window
        int sum=0;       
        for (int i=0;i<k;i++) {
        	sum+=a[i];
        }
        int max=sum;
        for(int i=k;i<n;i++) {
        	sum+=a[i]-a[i-k];
        	max=Math.max(sum,max);
        }
        System.out.println(max);
	}

}

/*

int max=0;
for(int i=0;i<=n-k;i++){
	int sum=0;
	for(int j=i;j<i+k;j++){
		sum+=a[j];
	}
	max=Math.max(sum,max);
}

*/