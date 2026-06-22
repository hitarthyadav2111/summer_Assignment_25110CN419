import java.util.*;
public class To_Find_Character_Frequency {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        int l=str.length();
        char ch=' ',ch1=' ';
        int count=0;
        //the loop skips the iteration when the the space character is 
        //found because its not considered a character in english language so we don't count it
        for(int i=0;i<l;i++){
            ch=str.charAt(i);
            if(ch==' ')
                    continue;
            for(int j=0;j<l;j++){
                ch1=str.charAt(j);
                if(ch==ch1){
                    count++;
                }
            }
            System.out.println(ch+" = "+count);
            str=str.replace(ch,' ');
            count=0;
        }
            
    }
}

