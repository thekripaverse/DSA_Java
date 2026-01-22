package Placement;

import java.util.*;

public class Year {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		if((x%400==0)||(x%4==0 && x%100!=0)) {
			System.out.println("Leap year");
		}
		else {
			System.out.print("Not a Leap year");
		}
		in.close();
	}
}
 //& - bit manipulation
// && - Logical And