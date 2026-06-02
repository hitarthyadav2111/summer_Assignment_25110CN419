import java.math.*;
import java.util.*;
public class Factorial_with_Recursion {
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        Factorial_with_Recursion ob = new Factorial_with_Recursion();
        long f=ob.fact(n);
        System.out.println("The factorial of given number "+n+" is "+f);
    }
    int i=1;
    long fact(int a) {
        if(i>a) {
            return 1;
        }
        else {
            return i++*fact(a);
        }
    }
}
