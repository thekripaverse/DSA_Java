package Patterns;

import java.util.Scanner;

public class InverseRightangle {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i=n;i>=0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
            	System.out.print("*");
            }
            System.out.println();
        }
   }
}
