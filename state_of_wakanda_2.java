import java.util.*;

public class upper_diagonal_elements{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows and column:");
        int n=sc.nextInt();
        int[][] arr= new int[n][n];
        System.out.println("enter the elements of the matrix:-");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        System.out.println("your matrix looks likes:-");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("The upper diagonal elements are as follows:-");
        for(int k=0;k<n;k++){
            for(int i=0,j=k;i<n-k&&j<n;i++,j++){
                System.out.print(arr[i][j] +" ");
            }
        }
    }
}
