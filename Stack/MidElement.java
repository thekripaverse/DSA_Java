package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MidElement {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	Stack<Integer> s1=new Stack<>();
	for(int i=0;i<size;i++){
        int a=in.nextInt();
        s1.push(a);
    }
	int mid=size/2;
	int v=0;
	while(v<mid) {
		s1.pop();
		v++;
	}
	System.out.println(s1.peek());
	}
}
