import java.util.*;
public class palindrome_substrings{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.next();
        solution(str);
    }
    public static void solution(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if (ispalindrome(str.substring(i,j))==1){
                    System.out.println(str.substring(i,j));
                }
                else if(ispalindrome(str.substring(i,j))==0){
                    continue;
                }
            }
        }
    }
    public static int ispalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return 0;
            }
            i++;
            j--;
        
        } 
        return 1;  
    }
}
