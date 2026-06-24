//the program removes duplicate characters from a string 
import java.util.*;
public class To_Remove_Duplicate_Characters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String str=in.nextLine();
        str=str.trim();
        char c[]=str.toCharArray();
        int l=str.length();
        for(int i=0;i<l;i++){
            if(c[i]==' ')
                continue;
            for(int j=i+1;j<l;j++)
            {
                if(c[i]==c[j])
                    c[j]='$';
            }
        }
        System.out.println("The resulting word is");
        for(int i=0;i<l;i++){
            if(c[i]!='$')
                System.out.print(c[i]);
        }
    }
}
