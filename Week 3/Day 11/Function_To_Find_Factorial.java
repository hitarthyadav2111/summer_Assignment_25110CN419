import java.util.*;
public class Function_To_Find_Factorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = in.nextInt();
        Function_To_Find_Factorial ob = new Function_To_Find_Factorial();
        long f=ob.factorial(a);
        System.out.println("The factorial of the given number "+a+" is "+f);
    }
    long factorial(int n) {
        long fact=1;
        for(int i=1;i<=n;i++) {
            fact*=i;
        }
        return fact;
    }
}