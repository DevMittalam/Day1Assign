package assignment1.day1;

import java.util.Scanner;

public class matrix {
    public static void main(String...ar)
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	int a[][]=new int[n][m];
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<m;j++)
    		{
    			a[i][j]=sc.nextInt();
    		}
    	}
    	int i, k = 0, l = 0;
      while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
    }
 } 
}