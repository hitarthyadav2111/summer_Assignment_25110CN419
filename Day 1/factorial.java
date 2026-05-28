import java.util.*;
public class factorial {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int factorial=1;
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
          factorial=factorial*i;
        }
        System.out.println("The factorial of the given number is ="+factorial);
    }
    
}
