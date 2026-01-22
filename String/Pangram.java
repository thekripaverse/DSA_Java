package String;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine().replaceAll(" ", "");
		int n=s.length();
		HashSet<Character> x=new HashSet<>();
		for(int i=0;i<n;i++) {
			char c=s.charAt(i);
			x.add(c);
		}
		if(x.size()==26) {
			System.out.println("Pangram");
		}
		else {
			System.out.println("Not");
		}
	}
}
