import java.util.*;
public class To_Convert_Lowercase_to_Uppercase {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        int l=str.length();
        char ch=' ';
        String str1="";
        for(int i=0;i<l;i++){
            ch=str.charAt(i);
            if(ch>=97 && ch<=122){
                str1=str1+(char)(ch-32);
            }
            else if(ch>=65 && ch<=90){
                str1=str1+ch;
            }
            else{
                str1=str1+ch;
            }
        }
        System.out.println("The uppercase version of the given string is "+str1);
    }
}

