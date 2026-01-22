package Placement;
import java.util.*;
public class Perfectnumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int perfect=0;
		for (int i=1;i<x;i++) {
			if (x%i == 0) {
				
				perfect+=i;
			}
		}
		if (x==perfect) {
			System.out.println("Perfect Number");
		}
		else{
			System.out.println("Not");
		}
	}
}

//divisors ellathaiyu add panna athu input oda equal ah iruntha perfect number
