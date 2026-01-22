package Placement;
import java.util.*;
public class In_out {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		System.out.println("Output : "+(mul(x,y,z)-add(x,y,z)));
		in.close();
	}
	public static int add(int x, int y, int z) {
		return x+y+z;
	}
	public static int mul(int x, int y, int z) {
		return x*y*z;
	}
}

//negative to positive ---- Math.abs()