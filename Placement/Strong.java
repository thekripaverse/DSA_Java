package Placement;

import java.util.Scanner;

public class Strong {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int digit=Integer.toString(x).length();
		int y=x;
		int sum=0;
		while(x!=0) {
			int d=x%10;
			sum+=factorial(d);
			x=x/10;
		}
		if(y==sum) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("No");
		}
		in.close();
}
	public static int factorial(int z) {
		int fact=1;
		for (int i=1;i<=z;i++) {
			fact=fact*i;
		}
		return fact;
	}
}
// Strong number nna 145 = 1!+ 4! + 5!