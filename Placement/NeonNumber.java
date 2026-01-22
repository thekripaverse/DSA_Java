package Placement;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int sq=x*x;
		int sum=0;
		while(sq!=0) {
			int d=sq%10;
			sum+=d;
			sq=sq/10;
		}
		if (x==(sq+sum)) {
			System.out.println("Neon number");
		}
		else {
			System.out.println("Not");
		}
}
}

//Input = square of input + sum of digits