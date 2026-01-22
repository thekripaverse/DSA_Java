package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	int[] a=new int[size];
	for(int i=0;i<size;i++){
        a[i]=in.nextInt();
    }
    Stack<Integer> s=new Stack<>();
    for(int i=0;i<size;i++){
        s.push(a[i]);
    }
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
	}
}
