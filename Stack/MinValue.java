package Stack;
import java.util.Scanner;
import java.util.Stack;
public class MinValue {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int min=Integer.MAX_VALUE;
	int size=in.nextInt();
	Stack<Integer> s1=new Stack<>();
	for(int i=0;i<size;i++){
        int a=in.nextInt();
        s1.push(a);
        if(a<min) {
        	min=a;
        }
    }
	System.out.println(min);
	}
}
