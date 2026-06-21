import java.util.*;
public class To_Reverse_a_String {
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
        System.out.println("The reverse string is "+rev);
    }
}
