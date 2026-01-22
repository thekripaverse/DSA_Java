package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	Stack<Integer> s1=new Stack<>();
	for(int i=0;i<size;i++){
        int a=in.nextInt();
        s1.push(a);
    }
	Stack<Integer> s2= (Stack<Integer>) s1.clone();
	Stack<Integer> s3=new Stack<>();
	for(int i=0;i<size;i++){
        s3.push(s2.pop());
    }
	if(s1.equals(s3)) {
		System.out.print("Palindrome");
	}
	else {
		System.out.print("Not a Palindrome");
	}
	}
}
