package Placement;

import java.util.Scanner;

public class Firstnumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		while(x>=10) {
			x=x/10;
		}
		System.out.println(x);
		in.close();
	}
}
