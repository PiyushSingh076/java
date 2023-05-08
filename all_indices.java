/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=1;i<=n;i++){
		    int a=sc.nextInt();
		    int count=0;
		    for(int j=1;j<=a;j++){
		        int p=sc.nextInt();
		        if (p>1000){
		            count++;
		        }
		    }
		    arr[i-1]=count;
		}
		for (int i=0;i<n;i++){
		    System.out.println(arr[i]);
		}
	}
}
