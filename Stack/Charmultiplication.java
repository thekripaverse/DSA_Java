package Stack;
//zoho question
import java.util.Scanner;
import java.util.Stack;
public class Charmultiplication {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		Stack<Character> ch=new Stack<>();
		Stack<Integer> nos=new Stack<>();
		int n=s.length();
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(Character.isLetter(c)) {
			ch.push(c);
		}
		else if((Character.isDigit(c))) {
			int num=0;
			while(i<n && Character.isDigit(s.charAt(i))) {
				num=num*10+(s.charAt(i)-'0');
				i++;
			}
			i--;
			nos.push(num);
		}
	}
	Stack<Character> a=new Stack<>();
	Stack<Integer> b=new Stack<>();
	while(!ch.isEmpty()) {
		a.push(ch.pop());
	}
	while(!nos.isEmpty()) {
		b.push(nos.pop());
	}
	while(!a.isEmpty()) {
		char c=a.pop();
		int count=b.pop();
		for(int i=0;i<count;i++) {
			System.out.print(c);
		}
	}
	}
}
