package Algorithm;

import java.util.*;
class NQueen 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        if(!nqueen(a,n,0))
        {
            System.out.print("Invalid");
        }
    }
    public static boolean nqueen(int a[][],int n,int r)
    {
        if(r==n)
        {
            print(a,n);
            return true;
        }
        boolean res = false;
        for(int i=0;i<n;i++)
        {
            if(safe(a,n,r,i))
            {
                a[r][i]=1;
                res = nqueen(a,n,r+1)||res;
                a[r][i]=0;
            }
        }
        return res;
    }
    
    public static boolean safe(int a[][],int n,int r,int c)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i][c]==1)
            {
                return false;
            }
        }
        int i=r-1;
        int j=c-1;
        while(i>=0 && j>=0)
        {
            if(a[i][j]==1)
            {
            return false;
                
            }
            i--;
            j--;
        }
        i=r-1;
        j=c+1;
        while(i>=0 && j<a.length)
        {
            if(a[i][j]==1)
            {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    public static void print(int a[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
  
}
