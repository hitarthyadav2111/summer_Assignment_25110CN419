import java.util.*;
public class To_Find_String_Length_without_strlen_function {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        char ch[]=str.toCharArray();
        int f=0;
        for (char c  : ch) {
            f++;
        }
        System.out.println("The length of the given string is "+f);
    }
}
