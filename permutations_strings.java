import java.util.*;
public class permutations_strings{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string:");
        String str= sc.next();
        solution(str);
    }
    
    public static void solution(String str){
        int len= str.length();
        int total= factorial(len);
        
        for (int i=0;i<total;i++){
            StringBuilder sb= new StringBuilder(str);
            int temp=i;
             for(int j=len;j>=1;j--){
                int q=temp/j;
                int r=temp%j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
             }
             System.out.println();
        }
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
          fact *= i;
        }
        return fact;
      }
}