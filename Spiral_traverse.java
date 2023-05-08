
import java.util.*;

public class Spiral_traverse {
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the number of rows:");
    int n = scn.nextInt();
    System.out.print("enter the number of columns:");
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    System.out.println("Your given array is:-");
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
          System.out.print(arr[i][j]+"  ");
        }
        System.out.print("\n");
    }

     int minrow=0;
     int mincol=0;
     int maxrow=n-1;
     int maxcol= m-1;

     int cnt=0;
     int te=n*m;

     System.out.println("Spiral traversing of matrix gives result as:-");

     while(cnt<te){
        // left wall
        for(int i=minrow;i<=maxrow;i++){// vertical move krne ke liye i row ke terms me define hoga
            System.out.print(arr[i][mincol]);
            System.out.print("-->");
            cnt++;
        }
        mincol++;
        // bottom wall
        for(int i=mincol;i<=maxcol;i++){// horizontal move krne ke liye i col ke terms me define hoga//
            System.out.print(arr[maxrow][i]);
            System.out.print("-->");
            cnt++;
        }
        maxrow--;
        //right wall
        for(int i=maxrow;i>=minrow;i--){
            System.out.print(arr[i][maxcol]);
            System.out.print("-->");
            cnt++;
        }
        maxcol--;
        //top wall
        for(int i=maxcol;i>=mincol;i--){
            System.out.print(arr[minrow][i]);
            System.out.print("-->");
            cnt++;
        }
        minrow++;
     }
  }
}