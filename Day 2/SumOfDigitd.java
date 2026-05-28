import java.util.*;
public class SumOfDigitd {
    public static void main(String args[]) {
    Scanner in =new Scanner(System.in);
    int sum=0;
    System.out.println("Enter the number");
    int n=in.nextInt();
    while(n!=0)
    {
        sum = sum + n%10;
        n=n/10;
    }
    System.out.println("The sum of the digits of the number entered is "+sum);
}
}