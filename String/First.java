package String;

import java.util.Scanner;

public class First {
		public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine().replaceAll(" ","");  //.trim
		//char c=in.next().charAt(0);
		int upper=0;
		int lower=0;
		int digit=0;
		int special=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				upper++;
			}
			else if(Character.isLowerCase(c)) {
				lower++;
			}
			else if(Character.isDigit(c)) {
				digit++;
			}
			else {
				special++;
			}
		}
		System.out.println(upper+" "+lower+" "+digit+" "+special);
		}
}
