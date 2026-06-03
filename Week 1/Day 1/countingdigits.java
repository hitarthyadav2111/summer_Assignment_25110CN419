import java.util.*;
public class countingdigits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int c=0;
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        System.out.println("Number of digits in the number are ="+c);
    }
}

