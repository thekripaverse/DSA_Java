package Placement;

import java.util.Scanner;

public class Ducknumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String x=in.nextLine();
		boolean Duck=false;
		if(x.charAt(0)=='0') {
			Duck=false;
		}
		else {
			for(int i=1;i < x.length();i++) {
				if(x.charAt(i)=='0') {
					Duck=true;
					break;
				}
			}
		}
		
		if(Duck) {
			System.out.println("Duck number");
		}
		else {
			System.out.println("Not");
		}
	}
}

//number which contains 0 not leading zeros
