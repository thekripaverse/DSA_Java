package Queue;

public class MinheapPriority {
	int a[];
	int size;
	public MinheapPriority(int n) {
		a=new int[n];
		size=0;
	}
	public void add(int v) {
		if(size==a.length) {
			System.out.println("Queue is full");
			return;
		}
		a[size]=v;
		upheap(size);
		size++;
	}
	public int poll() {
		if(size==0) {
			return -1;
		}
		int res=a[0];
		a[0]=a[size-1];
		size --;
		downheap(0);
		return res;
	}
	public void upheap(int ind) {
		while(ind>0) {
			int p=(ind-1)/2;
			if(a[p]>a[ind]) {
				swap(p,ind);
				ind=p;
			}
			else {
				break;
			}
		}
	}
	public void downheap(int ind) {
		while(true) {
			int l=2*ind+1;
			int r=2*ind+2;
			int small=ind;
			if(l<size && a[l]<a[small]) {
				small=l;
			}
			if(r<size && a[r]<a[small]) {
				small=r;
			}
			if(small!=ind) {
				swap(small,ind);
				ind=small;
			}
			else {
				break;
			}
		}
	}
	public void swap(int m, int n) {
		int temp=a[m];
		a[m]=a[n];
		a[n]=temp;
	}
	public static void main(String[] args) {
		MinheapPriority ob=new MinheapPriority(5);
		ob.add(10);
		ob.add(4);
		ob.add(5);
		ob.add(8);
		System.out.println(ob.poll());
	}
	
}
