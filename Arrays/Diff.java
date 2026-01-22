package Arrays;
import java.util.Scanner;
public class Diff {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        int evensum=0;int oddsum=0;
        for (int j=0;j<a.length;j++) {
        	if (j%2==0) {
        		evensum+=a[j];
        	} else {
        		oddsum+=a[j];
        	}
        }
        int Difference=evensum-oddsum;
        System.out.println(evensum+"-"+oddsum);
        System.out.println(Difference);
        
	}
}
