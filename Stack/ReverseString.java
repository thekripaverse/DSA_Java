package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	int n=s.length();
    Stack<Character> a=new Stack<>();
    for(int i=0;i<n;i++){
        char c=s.charAt(i);
        a.push(c);
    }
    while(!a.isEmpty()){
        System.out.println(a.pop());
    }
	}
}
