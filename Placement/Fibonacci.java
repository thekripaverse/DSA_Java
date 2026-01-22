package Placement;
import java.util.*;
public class Fibonacci {
	public static void fibo(){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0,b=1;
		System.out.println(a+"\n"+b);
		for (int i=2;i<n;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		in.close();
	}
	public static int fibo(int x) {
		return fibo(x-1)+fibo(x-2);
	}
}
