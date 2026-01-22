package Algorithm;

import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String a="";
		permu(s,a);
		
	}
	public static void permu(String s,String a) {
		if(s.length()==0) {
				System.out.println(a);
				return;
			}
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			String r=s.substring(0,i)+s.substring(i+1);
			permu(r,a+c);
		}
	}
}
