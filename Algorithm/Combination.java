package Algorithm;

import java.util.Scanner;

public class Combination {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String a="";
		comb(s,0,a);
		
	}
	public static void comb(String s,int ind,String a) {
			if(s.length()>0) {
				System.out.println(a);
			}
		for(int i=ind;i<s.length();i++) {
			char c=s.charAt(i);
			comb(s,i+1,a+c);
		}
	}
}
