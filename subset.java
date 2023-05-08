import java.io.*;
import java.util.*;
public class subset{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizd of the array:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array elements:-");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();   
        }
        int lim= (int) Math.pow (2, arr.length);
        for (int i=0;i<lim;i++){
            int temp=i;
            String set="";
            for (int j=n-1;j>=0;--j){ // j is different positions in the array on which 
                //we will print binary numbers (if three nos entered then j= 0,1,2)
                // since binary conversion works from backwards.....
                // convertting into binary to print accordingly..
                int rem=temp%2;
                temp=temp/2;
                if (rem==0){
                    set="- " + set;
                }
                else if(rem==1){
                    set= arr[j]  + " " + set;
                }
            }
            System.out.println(set);
        }
    }
}