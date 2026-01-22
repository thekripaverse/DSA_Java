package Placement;

import java.util.Scanner;

public class Ambicable {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		if (sumofdivisor(a)==b && sumofdivisor(b)==a) {
			System.out.println("Ambicable Number");
		}
		else {
			System.out.println("Not");
		}
	}
	public static int sumofdivisor(int x){
		int divisor=0;
		for (int i=1;i<x;i++) {
			if (x%i == 0) {
				
				divisor+=i;
			}
		}
		return divisor;
	}
}

//a,b input. sum of divisor(a)==b and sum of divisor(b)==a
