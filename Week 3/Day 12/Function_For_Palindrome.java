import java.util.*;
public class Function_For_Palindrome {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number");
        int a = in.nextInt();
        Function_For_Palindrome ob = new Function_For_Palindrome();
        ob.palindrome(a);
    }
    void palindrome(int n){
        int n1=n;
        int r=0;
        while(n1!=0){
            r=r*10+n1%10;
            n1=n1/10;
        }
        if(r==n){
            System.out.println("The given number "+n+" is a Palindrome Number");
        }
        else {
            System.out.println("The given number "+n+" is not a Palindrome Number");
        }
    }
}
