package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Insertatbeg {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int e=in.nextInt();
	int size=in.nextInt();
	Stack<Integer> s1=new Stack<>();
	for(int i=0;i<size;i++){
        int a=in.nextInt();
        s1.push(a);
    }
    Stack<Integer> s2=new Stack<>();
    s2.push(e);
    for(int i=0;i<size;i++){
        s2.push(s1.pop());
    }
    for(int i=0;i<size+1;i++){
        System.out.print(s2.peek());
        s2.pop();
    }
	}
}
