package Placement;

import java.util.Scanner;

public class Magicalnumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int mag=sumofdigits(x);
		while(mag>=10) {
			mag=sumofdigits(mag);
		}
		System.out.println(mag);
		mag(x);
	}
	public static int sumofdigits(int x) {
		int sum=0;
		while(x!=0) {
			int d=x%10;
			sum+=d;
			x=x/10;
		}
		return sum;
	}
	public static void mag(int x) {
		while(x>=10) {
			int sum=0;
			while (x!=0) {
				int d=x%10;
				sum+=d;
				x=x/10;
			}
			x=sum;
			System.out.println(sum);
		}
	}
}

//single digit varra varaiku add pannanu