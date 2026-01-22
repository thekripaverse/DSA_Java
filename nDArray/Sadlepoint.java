package nDArray;

import java.util.Scanner;

public class Sadlepoint {
	public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int a[][]=new int[n][m];
        for (int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		a[i][j]=in.nextInt();
        	}
        }
        int c=0;
        for(int i=0;i<n;i++) {
        	int min=a[i][0];
        	int cmin=0;
        	for(int j=0;j<n;j++) {
        		if(a[i][j]<min) {
        			min=a[i][j];
        			cmin=j;
        		}
        	}
        	boolean s=true;
            for(int k=0;k<n;k++) {
            	if(a[k][cmin]>min) {
            		s=false;
            		break;
            	}
            	if(s) {
            	System.out.print(a[k][cmin]);
            	}
            }
            }
        }
        
	}
