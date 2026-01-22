package Arrays;
import java.util.Scanner;
public class BuySellStock {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        int maxprofit=0;
        int min=a[0];
        for(int i=0;i<n;i++) {
        	if (a[i]<min) {
        		min=a[i];
        	}
        	else if (a[i]-min>maxprofit) {
        		maxprofit=a[i]-min;
        	}
        }
        System.out.print(maxprofit);
	}
}
