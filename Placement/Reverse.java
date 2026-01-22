package Placement;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int rev=0;
		while(x!=0) {
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}
		System.out.println(rev);
		in.close();
	}
}
