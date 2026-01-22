package Placement;

import java.util.Scanner;

public class Swapping{
	public static void main(String[] args) {
		//Without temporary variable
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		//using xor - bit manipulation
		int x=in.nextInt();
		int y=in.nextInt();
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x);
		System.out.println(y);
		in.close();
	}
}