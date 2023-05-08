import java.util.*;
public class recurrsion_sum{
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return (n+sum(n-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the value:");
        int n=sc.nextInt();
        int a=sum(n);
        System.out.println(a);
    }
}