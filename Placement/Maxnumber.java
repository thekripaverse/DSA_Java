package Placement;

import java.util.Scanner;

public class Maxnumber {
	public static void main(String[] args) {
		//Without temporary variable
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int max=0;
		while(a!=0) {
			int d=a%10;
			if (d>max) {
				max=d;
			}
			a=a/10;
		}
		System.out.println(max);
		min();
		in.close();
	}
	public static void min() {
		Scanner in=new Scanner(System.in);
		int y=in.nextInt();
		int min=99;
		while(y!=0) {
			int d=y%10;
			if (d<min) {
				min=d;
			}
			y=y/10;
		}
		System.out.println(min);
		in.close();
}
}
