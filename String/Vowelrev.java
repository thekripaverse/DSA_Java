package String;

import java.util.Scanner;

public class Vowelrev {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine().replaceAll(" ","").toLowerCase();
		char c1[]=s.toCharArray();
		StringBuffer x=new StringBuffer();
		for (int i=0; i<s.length(); i++) {
		    char c=s.charAt(i);
		    if (vowel(c)){
		        x.append(c);
		    }
		}
		char c2[]=x.reverse().toString().toCharArray();
		int z=0;
		for(int i=0;i<c1.length;i++) {
			if(vowel(c1[i])) {
				c1[i]=c2[z++];
			}
		}
		for(int i=0;i<c1.length;i++) {
			System.out.print(c1[i]);
		}
}
	public static boolean vowel(char c) {
		return c=='a' || c=='i' || c=='o' || c=='e' || c=='u';
	}
}
