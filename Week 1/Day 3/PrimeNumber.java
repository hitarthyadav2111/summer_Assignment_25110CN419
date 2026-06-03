import java.util.*;
public class PrimeNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a non-zero positive number");
        int n=in.nextInt();
        int c=0;
        for(int i=2;i<=n/2;i++) {
            if(n%i==0) {
                c++;
            }
        }
        if(n==1 || c>0)
        {
            System.out.println("It is not a Prime Number");
        }
        else
        {
            System.out.println("It is a Prime Number");
        }
    }
    
}
