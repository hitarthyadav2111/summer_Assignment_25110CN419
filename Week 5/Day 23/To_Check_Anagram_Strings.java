import java.util.*;
public class To_Check_Anagram_Strings {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first word");
        String a=in.next();
        System.out.println("Enter the second word");
        String b=in.next();
        a=a.trim();
        b=b.trim();
        char ch=' ',ch1=' ';int flag=0;
        int l1=a.length();
        int l2=b.length();
        char c1[]=a.toCharArray();
        char c2[]=b.toCharArray();
        if(l1!=l2)
            flag=1;
        //replacing characters which match by a space character
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(c1[i]==c2[j]){
                    c1[i]=' ';
                    c2[j]=' ';
                }
            }
        }
        //checking if any other character is left besides space
        for(int i=0;i<l1;i++){
            if(c1[i]!=' ')
                flag=1;
        }
        for(int i=0;i<l2;i++){
            if(c2[i]!=' ')
                flag=1;
        }
        if(flag==1){
            System.out.println("The given words are not anagrams");
        }
        else{
            System.out.println("The given words are anagrams");
        }
    }
}
