package Algorithm;

import java.util.*;

class MergeSort{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
		    a[i] = in.nextInt();
		    
		}
		sort(a,0,n-1);
		for(int i : a)
		{
		    System.out.print(i+" ");
		}
}

public static void sort(int a[] , int l , int r)
{
    if(l<r)
    {
        int mid = (l+r)/2;
        sort(a,l,mid);
        sort(a,mid+1,r);
        merge(a,l,mid, r);
    }
}


public static void merge(int a[],int l , int mid , int r)
{
    int n1 = mid-l+1;
    int n2 = r-mid;
    
    int x[]= new int[n1];
    int y[] = new int[n2];
    for(int i=0;i<n1;i++)
    {
        x[i] = a[l+i];
    }
    for(int i=0;i<n2;i++)
    {
        y[i] =a[mid+1+i];
    }
    int i=0,j=0,k=l;
    while(i<n1 && j<n2)
    {
        if(x[i]<= y[j])
        {
            a[k] = x[i];
            i++;
        }
        else 
        {
            a[k] = y[j];
            j++;
        }
        k++;
        
    }
    while(i<n1)
    {
        a[k] = x[i];
        i++;
        k++;
    }
    while(j<n2)
    {
        a[k]=y[j];
        j++;
        k++;
    }
}
}
