package Stack;
import java.util.Scanner;
import java.util.Stack;
public class AdjacentDup {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	int n=s.length();
    Stack<Character> a=new Stack<>();
    for(int i=0;i<n;i++){
        char c=s.charAt(i);
        if(a.isEmpty()) {
        	a.push(c);
        }
        if(a.peek()!=c) {
        	a.push(c);
        }
    }
    	System.out.println(a);
	}
}
