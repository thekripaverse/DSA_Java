package String;

import java.util.Scanner;

public class VowelConsonants {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine().replaceAll(" ","").toLowerCase();
		String vow=new String();
		String con=new String();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a' || c=='i' || c=='o' || c=='e' || c=='u') {
				vow+=c;
			}
			else {
				con+=c;
			}
		}
		System.out.println(vow);
		System.out.println(con);
	}
}
