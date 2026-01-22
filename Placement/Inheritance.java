package Placement;
//Single
class A {
	public static void kripa() {
		System.out.println(" Parent A ");
	}
}
class B extends A{
	public static void kce() {
		System.out.println(" Child B ");
	}
}
//Multilevel
class C extends B{
	public static void methodc() {
		System.out.println(" GrandChild C ");
	}
}
//Hierarchical
class D extends A{
	public static void methodd() {
		System.out.println(" Child D ");
	}
}
class E extends A{
	public static void methode() {
		System.out.println(" Child E ");
	}
}

//Hybrid
interface F {
	public void fmethod();
}
interface G {
	public void gmethod();
}
class H implements F,G{
	public void fmethod() {
		System.out.println(" Interface F in H ");
	}
	public void gmethod() {
		System.out.println(" Interface G in H ");
	}
}

//Multiple
interface I{
	public void imethod();
}
interface J extends I{
	public void jmethod();
}
interface K extends I{
	public void kmethod();
}
class L implements J,K{
		public void imethod() {
			System.out.println(" I method in class L ");
		}
		public void jmethod() {
			System.out.println(" J method in class L ");
		}
		public void kmethod() {
			System.out.println(" K method in class L ");
		}
}

public class Inheritance{
	public static void main(String[] args) {
		//Single
		B ob=new B();
		ob.kripa();
		ob.kce();
		
		//Multilevel
		C obc=new C();
		obc.kripa();
		obc.methodc();
		
		//Hierarchical
		ob.kripa();
		ob.kce();
		D obd=new D();
		obd.kripa();
		obd.methodd();
		E obe=new E();
		obe.kripa();
		obe.methode();	
		
		//Hybrid
		H obh=new H();
		obh.fmethod();
		obh.gmethod();
		
		//Multiple
		L obl=new L();
		obl.imethod();
		obl.jmethod();
		obl.kmethod();
	}
}