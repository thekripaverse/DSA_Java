package String;

import java.util.Scanner;

public class buffer {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine().replaceAll(" ", "");
		int n=s.length();
		StringBuffer x=new StringBuffer();
		for(int i=0;i<n;i++) {
			char c=s.charAt(i);
			x.append(c);
		}
		System.out.print(x.reverse().toString());
	}
}
