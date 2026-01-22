package nDArray;
import java.util.*;
public class GreaterthanAvg {
		public static void main(String[] args){
	        Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        int m=in.nextInt();
	        int div=n*m;
	        int a[][]=new int[n][m];
	        int avg=0;
	        for (int i=0;i<n;i++) {
	        	for(int j=0;j<m;j++) {
	        		a[i][j]=in.nextInt();
	        	}
	        }
	        for (int i=0;i<n;i++) {
	        	for(int j=0;j<m;j++) {
	        		avg+=a[i][j];
	        	}
	        }
	        avg=avg/div;
	        for (int i=0;i<n;i++) {
	        	for(int j=0;j<m;j++) {
	        		if (a[i][j]>avg){
	        	        System.out.print(a[i][j]+" ");;
	        		}
	        	}
	        }
		}

}
