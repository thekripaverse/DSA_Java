package Placement;

public class Loop {
	public static void main(String[] args) {
		int x=0;
		System.out.println("Post increment");
		while (x<10) {
			System.out.println(x++);
		}
		int y=0;
		System.out.println("Pre increment");
		while (y<10) {
			System.out.println(++y);
		}
		int z=10;
		System.out.println("Post decrement");
		while (z>0) {
			System.out.println(z--);
		}
		int a=10;
		System.out.println("Pre decrement");
		while (a>0) {
			System.out.println(--a);
		}
	}
	public static void forloop() {
		System.out.println("For Loop");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
