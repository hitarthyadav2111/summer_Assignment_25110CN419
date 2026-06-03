import java.util.*;
public class ProductOfDigits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int pro=1;
        while(n!=0)
        {
            pro=pro*(n%10);
            n=n/10;
        }
        System.out.println("The Product of the Digits is "+pro);
    }
    
}
