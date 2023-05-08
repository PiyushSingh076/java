import java.util.*;
public class remove_primes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of your array:");
        int n=sc.nextInt();
        ArrayList< Integer> a1 = new ArrayList< >();

        for (int i=0;i<n;i++){
            int val=sc.nextInt();
            a1.add(val);
        }

        for (int i=a1.size()-1;i>=0;i--){
            int val=a1.get(i);
            if(prime(val)==1){
                a1.remove(i);
            }
        }
        System.out.println(a1);
    }
    public static int prime(int n){
        int count =0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            return 1;
        } 
        else if(count>2){
            return 0;
        }
        return 0;
    }
}