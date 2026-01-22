package String;
import java.util.Scanner;
public class Wordrev {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			String s=in.nextLine();
			int n=s.length();
			String x[]=s.split(" ");
			for(int i=0;i<x.length;i++) {
				System.out.print(rev(x[i])+" ");
			}
			
		}
		public static String rev(String s) {
			StringBuffer x=new StringBuffer();
			int n=s.length();
			x.append(s);
			return x.reverse().toString();
		}
}
