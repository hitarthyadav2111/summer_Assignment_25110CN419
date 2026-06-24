//the program works by shifting one character at a time to the back, of the second word and comparing 
//it with the first word 
//the approach is a bit manual and the time complexity is O(n^2) but i did it completely by myself without 
//any help so its fine by me 
import java.util.*;
public class To_Check_String_Rotation {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1=in.next();
        System.out.println("Enter the second word");
        String word2=in.next();
        word1=word1.trim();
        word2=word2.trim();
        if(word1.length()!=word2.length()){
            System.out.println("The given words are not rotated strings");
        }
        else{
            int l=word1.length(),flag=0;
            char c1[]=word1.toCharArray();
            char c2[]=word2.toCharArray();
            To_Check_String_Rotation ob= new To_Check_String_Rotation();
            for(int i=0;i<l;i++){
                if(ob.check(c1, c2, l)){
                    flag=1;
                    break;
                }
                else{
                    c2=word2.toCharArray();
                    ob.reverse(c2,0,i);
                    ob.reverse(c2, i+1,l-1);
                    ob.reverse(c2,0,l-1);
                }
            }
            if(flag==1){
                System.out.println("The given words are rotated strings");
            }
            else{
                System.out.println("The given words are not rotated strings");
            }
        }

    }
    void reverse(char a[],int k,int n){
        char temp=' ';
        while(k<n){
            temp=a[k];
            a[k]=a[n];
            a[n]=temp;
            k++;
            n--;
        }
    }
    boolean check(char b[],char c[],int n1){
        int f=1;
        for(int i=0;i<n1;i++){
            if(b[i]!=c[i]){
                f=0;
                break;
            }
        }
        if(f==0)
            return false;
        else
            return true;
    }
}
