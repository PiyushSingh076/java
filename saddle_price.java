import java.util.*;

public class saddle_price{// Sadle point means element that 
    //is min in its row and max in its column//
    //note a 2d array will only have 1 saddle point 
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
        }for(int i=0;i<n;i++){
            int min=10000;
            int index_1=0;
            for(int j=0;j<m;j++){    
                if(arr[i][j]<min){
                    min=arr[i][j];
                    index_1=j;
                }
            }
            int max=0;
            for(int k=0;k<n;k++){
                if(arr[k][index_1]>max){
                    max=arr[k][index_1];
                }
            }
            if (max==min){
                System.out.print("The saddle price is:"+max);
            }
        }
    }
}