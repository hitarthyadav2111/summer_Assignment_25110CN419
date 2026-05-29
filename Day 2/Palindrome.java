import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int rev=0;
        int n1=n;
        while(n!=0)
        {
            rev=rev*10 + n%10;
            n=n/10;            
        }
        if(n1==rev) {
            System.out.println("The given number is a Palindrome Number ");
        }
        else {
            System.out.println("The given number is not a Palindrome Number");
        }
    }
}