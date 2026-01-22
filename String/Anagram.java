package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine().replace(" ", "");
		String s2=in.nextLine().replace(" ", "");
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean anagram=true;
		if(c1.length==c2.length) {
			for(int i=0;i<c1.length;i++) { 
					if (c1[i]!=c2[i]) {
						anagram=false;
						break;
					}
			}
		}
		if(anagram) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not");
		}
	}
}
