import java.util.*;
public class To_Find_Nth_Fibonacci_Term {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        int a=0,b=1,c;
        for(int i=1;i<n;i++) {
         c=a+b;
         a=b;
         b=c;
        }
        System.out.println("The "+n+"th term of the Fibonacci Series is = "+a);
    }
    
}
