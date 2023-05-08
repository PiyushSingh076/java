import java.io.*;
import java.util.*;
public class rot_90{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n= sc.nextInt();
        System.out.print("Enter the number of colums:");
        int m= sc.nextInt();
        int[][] arr= new int[n][m];
        System.out.println("Enter matrix elements:-");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("your maatrix looks likes:-");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i=0;i<n;i++){// or you can also initiate a separate array 
            // and then fill it in transpose manner//
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<(m-1)/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][m-1-j];
                arr[i][m-1-j]=temp;
            }
        }
        System.out.println("Matrix after 90 degree rotation looks like:-");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}