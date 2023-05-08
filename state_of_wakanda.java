import java.io.*;
import java.util.*;

public class state_of_wakanda{// basically usi matrix ko 90 degree 
    // rotate karke traverse karwa do//

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int n= sc.nextInt(); 
    System.out.println("Enter the number of column:");
    int m= sc.nextInt();
    int[][] arr = new int[n][m];
    System.out.println("Enter the destinations in order:-");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            int dest=sc.nextInt();
            arr[i][j]=dest;
        }
    }
    for (int i=0;i<m;i++){
        //traversing the matrix horizontally after completing one collumn//
        if (i%2==0){// if even number colum then traverse from bottom//
            for(int j=0;j<n;j++){
                System.out.print(arr[j][i]+"-->");
            }
        }
        else{
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[j][i]+"-->");
            }
        
        }
    }
 }

}