import java.util.*;
public class Function_For_Fibonacci {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms of the fibonacci series you want to print");
        int a = in.nextInt();
        Function_For_Fibonacci ob = new Function_For_Fibonacci();
        System.out.println(a+" terms of the fibonacci series are ");
        ob.fibonacci(a);
    }
    void fibonacci(int n) {
        int p=0,q=1;
        for(int i=1;i<=n;i++){
            System.out.println(p);
            q=q+p;
            p=q-p;
        }
    }
    
}
