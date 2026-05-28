import java.util.*;
public class ReverseOfNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int rev=0;
        System.out.println("Enter the number");
        int n = in.nextInt();
        while(n!=0)
        {
            rev=rev*10 + n%10;
            n=n/10;
        }
        System.out.println("The reverse of the given number is "+ rev);

    }
    
}
