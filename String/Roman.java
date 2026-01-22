package String;
import java.util.Scanner;
public class Roman {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine().trim();
		int prev=0;
		int res=0;
		for(int i=s.length()-1;i>=0;i--) {
			int curr=value(s.charAt(i));
			if(curr>=prev) {
				res+=curr;
			}
			else {
				res-=curr;
			}
			prev=curr;
		}
		System.out.print(res);
	}
	public static int value(char c) {
		switch(c) {
		case 'I':return 1;
		case 'V':return 5;
		case 'X':return 10;
		case 'L':return 50;
		case 'C':return 100;
		case 'D':return 500;
		case 'M':return 1000;
		}
			return 0;
		}
	}
