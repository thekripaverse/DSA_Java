package Algorithm;

import java.util.*;

class QuickSort{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i] = in.nextInt();
		    
		}
		quick(a,0,n-1);
		for(int i : a)
		{
		    System.out.print(i+" ");
		}
}

public static void quick(int a[] , int l , int h)
{
    if(l<h)
    {
        int p = sort(a,l,h);
        quick(a,l,p-1);
        quick(a,p+1,h);
    }
}


public static int sort(int a[],int l ,int h)
{
    int p = a[l];
    int i= l+1;
    int j = h;
    while(i<=j)
    {
        while(i<=h && a[i]<=p)
        {
            i++;
        }
            while(a[j]>p)
            {
                j--;
            }
            if(i<j)
            {
                int t = a[i];
                a[i]= a[j];
                a[j] = t;
            }
        
    }
    a[l] = a[j];
    a[j]=p;
    return j;
}
}
