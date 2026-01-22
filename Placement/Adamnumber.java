package Placement;

import java.util.Scanner;

public class Adamnumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int sq1=x*x;
		int rev_input=reverse(x);
		int sq_rev=rev_input*rev_input;
		int result=reverse(sq_rev);
		if (sq1==result) {
			System.out.println("Adam's");
		}
		else {
			System.out.println("No");
		}
	}
	public static int reverse(int x) {
		int rev=0;
		while(x!=0) {
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}
		return rev;
	}
}

//Adam's number
//12^2=144
//21^2=441