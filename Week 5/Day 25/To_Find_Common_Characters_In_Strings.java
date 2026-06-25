//Started learning java framework collection today so implemented hashset in this problem 
//Since it does not add duplicates
import java.util.*;
public class To_Find_Common_Characters_In_Strings {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string");
        String a=in.nextLine();
        System.out.println("Enter the second string ");
        String b=in.nextLine();
        char a1[]=a.toCharArray();
        char b1[]=b.toCharArray();
        HashSet<Character> ch=new HashSet<>();
        for(int i=0;i<a.length();i++){
            if(a1[i]==' ')
                continue;
            for(int j=0;j<b.length();j++){
                if(a1[i]==b1[j]){
                    ch.add(a1[i]);
                }
            }
        }
        System.out.println("The common characters are = "+ch);
    }
}
