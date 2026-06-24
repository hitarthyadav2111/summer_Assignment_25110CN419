import java.util.*;
public class To_find_longest_word {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str=in.nextLine();
        str=str.trim();
        String str1="";
        int l=str.length();
        char ch=' ';
        String longest="",current="";
        for(int i=0;i<l;i++){
            ch=str.charAt(i);
            if(ch!=' '){
                str1=str1+ch;
            }
            else{
                if(str.charAt(i-1)!=' '){
                    str1=str1+" ";
                }
            }
        }
        str1=str1+" ";
        int l1=str1.length();
        for(int i=0;i<l1;i++){
            ch=str1.charAt(i);
            if(ch!=' '){
                current=current+ch;
            }
            else if(ch==' '){
                if(current.length()>longest.length()){
                    longest=current;
                }
                current="";
            }
        }
        System.out.println("The longest word in the sentence is = "+longest+" and has "+longest.length()+" characters");
    }
}
