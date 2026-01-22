package Patterns;
import java.util.Scanner;
public class HaloSquare {
		public static void main(String[] args){
	        Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        for (int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                if(i==0 || j==0 || i==n-1 || j==n-1) {
	                	System.out.print("*\t");
	                }
	                else {
	                	System.out.print("\t");
	                }
	            }
	            System.out.println("\n");
	        }
	   }
}
