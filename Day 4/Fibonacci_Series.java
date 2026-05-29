import java.util.*;
public class Fibonacci_Series {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print of the Fibonacci Series");
        int n=in.nextInt();
        int a=0,b=1,c;
        System.out.println("The first "+n+" terms of the Fibonacci series are as follow");
        for(int i=1;i<n;i++) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
