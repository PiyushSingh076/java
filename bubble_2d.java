import java.util.*;

public class bubble_2d{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        System.out.print("Enter the number of columns:");
        int m=sc.nextInt();
        int[][] arr= new int[n][m];
        System.out.println("enter the elements of the matrix:-");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
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
        System.out.println("your sorted matrix looks likes:-");
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                for(int k=,l=j+1;k<n&&l<m;k++,l++){
                    while(k!=n-1&&l!=m-1){
                        if(arr[i][j]>arr[k][l]){
                            int temp=arr[i][j];
                            arr[i][j]=arr[k][l];
                            arr[k][l]=temp;
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
    
        