import java.io.*;
import java.util.*;
public class matrix_exit{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n= sc.nextInt();
        System.out.print("Enter the number of colums:");
        int m= sc.nextInt();
        int[][] arr= new int[n][m];
        System.out.println("Enter only 0/1:-");
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
        
        int i=0;
        int j=0;
        
        int east=0; // e-0,s-1,w-2,n-3
        while(true){
            east= (east+arr[i][j])%4;
            if (east==0){
                j++;// continues to move in east direction
            }
            else if (east==1){
                i++; //turns south
            }
            else if (east==2){
                j--;
            }
            else if (east==3){
                i--;
            }
        if (i<0){
            i++;// if exiting from top wall
            break;
        }
        else if (j<0){
            j++; // if exiting from left wall
            break;
        }
        else if (i==n){
            i--; // if exiting from bottom wall(since i becomes n which is more than maximum(n-1))
            break;
        }
        else if (j==m){
            j--; // if exiting from right wall
            break;
        }
    }
        System.out.println("THE EXITING COORDINATE IS:-");
        System.out.print("("+i+","+j+")");

    }
}