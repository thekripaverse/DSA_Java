package String;
import java.util.Scanner;
public class LongestPalindrome {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine().toLowerCase();
		String res="";
		for(int i=0;i<s.length();i++) {
			String a=pal(s,i,i); //odd
			String b=pal(s,i,i+1); //even
			if(a.length()>res.length()) {
				res=a;
			}
			else if(b.length()>res.length()) {
				res=b;
			}
		}
		System.out.println(res);
}
		public static String pal(String s,int l,int r) {
			while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
				l--;
				r++;
			}
			return s.substring(l+1,r);
		}
}
