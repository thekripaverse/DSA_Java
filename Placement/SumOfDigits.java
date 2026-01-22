package Placement;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int sum=0;
		while(x!=0) {
			int d=x%10;
			sum+=d;
			x=x/10;
		}
		System.out.println(sum);
		in.close();
	}
}
