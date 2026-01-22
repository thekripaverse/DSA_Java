package Stack;
import java.util.Stack;
public class UsingCollection {
	public static void main(String[] args) {
		Stack<Integer> x=new Stack<>();
		x.push(10);
		x.push(11);
		x.push(12);
		while(!x.isEmpty()) {
			System.out.println(x.pop());
		}
	}
}
