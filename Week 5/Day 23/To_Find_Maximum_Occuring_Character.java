import java.util.*;
public class To_Find_Maximum_Occuring_Character {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        str=str.trim();
        int l=str.length();
        char c[]=str.toCharArray();
        char high=' ';
        int count=0;int max=0;
        for(int i=0;i<l;i++){
            if(c[i]==' ')
                continue;
            for(int j=0;j<l;j++){
                if(c[i]==c[j])
                    count++;
            }
            if(count>max){
                max=count;
                high=c[i];
            }
            count=0;
        }
        System.out.println(high+" is the highest occuring character with frequency "+max);
    }
}
