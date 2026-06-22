import java.util.*;
public class To_Check_Palindrome_String {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        int l=str.length();
        String rev="";
        char ch=' ';
        for(int i=l-1;i>=0;i--){
            ch=str.charAt(i);
            rev=rev+ch;
        }
        //if we want to make it case sensitive we can just remove the ignorecase part of the function below
        if(str.equalsIgnoreCase(rev)){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not palindrome");
        }
    }
}
