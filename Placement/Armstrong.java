package Placement;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int digit=Integer.toString(x).length();
		int y=x;
		int sum=0;
		while(x!=0) {
			int d=x%10;
			sum+=Math.pow(d, digit);
			x=x/10;
		}
		if(y==sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("No");
		}
		in.close();
	}
}
 //Armstrong number nna 153 = (1**3)+(5**3)+(3**3)