package String;

import java.util.Scanner;

public class Nextconsonent {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine().toLowerCase();
		char c1[]=s.toCharArray();
		String Consonent="bcdfghjklmnpqrstvwxyz";
		char c2[]=Consonent.toCharArray();
		int z=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(vowel(c1[i])) {
				c1[i]=c2[z++];
			}
		}
		String res=new String(c1);
		System.out.println(res);
	}
	public static boolean vowel(char c) {
		return c=='a' || c=='i' || c=='o' || c=='e' || c=='u';
	}
}
