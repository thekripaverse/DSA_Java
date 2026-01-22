package Placement;
public class Sample {
    public static void main(String[] args) {
    	Sample ob = new Sample();
        System.out.println(kce(3,5));
        System.out.println(ob.kce(3,5));
    }
    public static int kce(int x,int y) {
    	return x+y;
    }
    public int kce2(int x,int y) {
    	return x+y;
    }
    //Static - static ah iruntha direct method call pannalam otherwise object create pannanum
}
