import java.util.*;
public class ceil_floor{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.print("enter the elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
// this program is correct for sorted inputs only....
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;
        int high=arr.length-1;
        int low = 0;
        while(low<=high){
            int mid=(low +high)/2;
            if (a<arr[mid]){
                high =mid-1;
                ceil=arr[mid];
            }
            else if (a>arr[mid]){
                low =mid+1;
                floor=arr[mid];
            }
            else{
                floor = ceil = arr[mid];
            }
        }
        System.out.println("Floor value is: "+floor+ "Ceil value is: "+ceil );
    }
}