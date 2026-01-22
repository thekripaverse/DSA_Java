package String;

import java.util.Scanner;

public class RemoveDup {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine().replace(" ", "");
		String res=new String();
		int n=s.length();
		boolean v[]=new boolean[n]; //visited array
        for(int i=0;i<n;i++) {
        	char a=s.charAt(i);
        	if(v[i]) {
        		continue;
        	}
        	int c=1;
        	for (int j=i+1;j<n;j++) {
        		char b=s.charAt(j);
        		if (a==b){
        			c++;
        			v[j]=true;
        		}
        		
        	}
        	if(c==1 || c==2) {
        		System.out.print(a+" ");
        	}
        }
	}
}
