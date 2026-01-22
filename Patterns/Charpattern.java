package Patterns;

import java.util.Scanner;

public class Charpattern {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				if(j==1 || j==n-i || i==j && i+j>n ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
