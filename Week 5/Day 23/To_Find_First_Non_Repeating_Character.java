import java.util.*;
public class To_Find_First_Non_Repeating_Character {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        int l = str.length();
        char ch=' ';
        int count=0;
        for(int i=0;i<l;i++){
            ch=str.charAt(i);
            if(ch==' ')
                continue;
            for(int j=0;j<l;j++){
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(ch+" is the first non repeating character");
                break;
            }
            count=0;
        }
    }
}
