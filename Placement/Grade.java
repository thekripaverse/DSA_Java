package Placement;

import java.util.*;

public class Grade {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		if(x>=91 && x<=100) {
			System.out.println("A grade");
		}
		else if(x>=81 && x<=90) {
			System.out.println("B grade");
		}
		else if(x>=71 && x<=80) {
			System.out.println("C grade");
		}
		else {
			System.out.print("Fail");
		}
		in.close();
	}
}