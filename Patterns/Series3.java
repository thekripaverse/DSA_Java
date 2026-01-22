package Patterns;

import java.util.Scanner;

public class Series3 {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if (i%2!=0) {
                	System.out.print(" "+(i*3)+" ");
                }
                else {
                	System.out.print(" "+(i*3)+"c"+" ");
                }
            }
            System.out.println();
        }
   }
}
