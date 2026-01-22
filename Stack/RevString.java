package Stack;
import java.util.Scanner;
import java.util.Stack;
public class RevString {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			String st=in.nextLine();
			String[] y=st.split(" ");			
			Stack<Character> s=new Stack<>();
			int i=0;
			while(i<y.length) {
				for(int j=0;j<y[i].length();j++) {
					char c=y[i].charAt(j);	
					s.push(c);
				}
				while(!s.isEmpty()) {
					System.out.print(s.pop());
				}
				i++;
				System.out.println();
			}
	}
}

