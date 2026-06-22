import java.util.*;
public class To_Count_Words_In_A_Sentence {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        str=str.trim();
        char ch=' ';
        String str1="";
        int l=str.length();
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
        //the above sequence reduces the multiple space characters between the words to a single one
        //the sequence written below counts the number of words by checking how many times the space character comes
        str1=str1+" ";
        int count=0;
        int l1=str1.length();
        for(int i=0;i<l1;i++){
            ch=str1.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        System.out.println("The given sentence has "+count+" words");
    }
}
