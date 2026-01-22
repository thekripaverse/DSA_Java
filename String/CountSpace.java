package String;

import java.util.Scanner;

public class CountSpace {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int n=s.length();
		int start=0;
		int end=0;
		int between=0;
		int i=0;
		while(i<n && s.charAt(i)==' ') {
			start++;
			i++;
		}
		int j=n-1;
		while(j>=0 && s.charAt(j)==' ') {
			end++;
			j--;
		}
		for(int k=start;k<=j;k++) {
			if(s.charAt(k)==' ') {
				between++;
			}
		}
		System.out.println("Start "+start);
		System.out.println("End "+end);
		System.out.println("Between "+between);
	}
}
