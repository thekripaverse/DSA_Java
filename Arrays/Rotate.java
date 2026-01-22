package Arrays;
import java.util.*;
public class Rotate {
		public static void main(String[] args){
	        Scanner in=new Scanner(System.in);
	        int k=in.nextInt();
	        int n=in.nextInt();
	        int a[]=new int[n];
	        for (int i=0;i<n;i++) {
	        	a[i]=in.nextInt();
	        }
	        int t[]=new int[n];
	        for(int i=0;i<n;i++) {
	        	t[(i+k)%n]=a[i];
	        }
	        for(int i=0;i<n;i++) {
	        	System.out.print(t[i]+"\t");
	        }
			
		}
}
