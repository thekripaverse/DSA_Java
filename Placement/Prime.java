package Placement;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		if(prime(x)) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a prime");
		}
		
	}
	public static boolean prime(int x) {
		if(x<=1) {
			return false;
		}
		for (int i=2;i*i<=x;i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
}
