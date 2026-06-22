import java.util.*;
public class To_Remove_Spaces {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        String str1="";
        char ch=' ';
        int l=str.length();
        for(int i=0;i<l;i++){
            ch=str.charAt(i);
            if(ch!=' '){
                str1=str1+ch;
            }
        }
        System.out.println("The given string after removing spaces is ");
        System.out.println(str1);
    }
}
