package String;
import java.util.*;
public class TimeRailway {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String x[]=s.split(":");
		String time=x[x.length-1];
		int n=Integer.parseInt(x[0]);
		if(time.equals("PM")) {
			n=n+12;
		}
        String y=Integer.toString(n);
        x[0]=y;
        for(int i=0;i<x.length;i++) {
        	System.out.print(x[i]+":");
        }
	}
}

/*
7:25:57:PM
*/
