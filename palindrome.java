import java.util.*;
 public class palindrome{
    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.next();
        int i=0;
        int j=str.length()-1;
        int count=0;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("the string is not a paindrome");
                break;
            }
            else if (str.charAt(i)==str.charAt(j)){
                count++;
                
            }
            i++;
            j--;
            if(count==str.length()/2){
                System.out.println("yes the string is a palindrome");
            }
        }           
    }
}