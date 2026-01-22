package Stack;
import java.util.Scanner;
import java.util.Stack;
public class PostfixException {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String st=in.nextLine();
	    Stack<Integer> s=new Stack<>();
	    for(int i=0;i<st.length();i++){
	    	char c=st.charAt(i);
	    	if(Character.isDigit(c)) {
	    		s.push(c-'0');
	    	}
	    	else {
	    	if(c=='+'|| c=='*'|| c=='-' || c=='/') {
		    	int a=s.pop();
		    	int b=s.pop();
		    	int res=special(c,a,b);
		    	s.push(res);
	    	}
	    }
	    }
    	System.out.println(s.peek());
	}
	public static int special(char c,int a,int b) {
		switch(c){
		case '+':return a+b;
		case '*':return a*b;
		case '-':return a-b;
		case '/':return a/b;
		}
		return 0;
	}
}
