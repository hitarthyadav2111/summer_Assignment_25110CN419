import java.util.*;
public class To_Count_Vowels_and_Consonants {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        int l=str.length();
        char ch=' ';
        int vow=0,con=0;
        for(int i=0;i<l;i++){
            ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vow++;
            }
            else if(ch!=' '){
                con++;
            }
        }
        System.out.println("Number of vowels = "+vow);
        System.out.println("Number of consonants = "+con);
    }
}
