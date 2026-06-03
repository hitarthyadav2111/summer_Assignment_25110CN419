import java.util.*;
public class Fibonacci_With_Recursion {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many terms of fibonacci do you want to print");
        int n=in.nextInt();
        if(n>0) {
        Fibonacci_With_Recursion ob= new Fibonacci_With_Recursion();
        System.out.println(n+" terms of the Fibonacci series are");
        ob.fibonacci(0,1,1,n);
        }
        else {
            System.out.println("Enter valid number of terms");
        }
    }
    int fibonacci(int a,int b,int i,int n1) {
        if(i>n1) {
            return 0;
        }
        else {
            System.out.println(a);
            return fibonacci(b,a+b,i+1,n1);
        }

    }
}