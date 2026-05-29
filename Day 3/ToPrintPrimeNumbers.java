//To print prime numbers in a range
import java.util.*;
public class ToPrintPrimeNumbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int c=0;
        System.out.println("Enter the lower limit of the range");
        int l=in.nextInt();
        System.out.println("Enter the higher limit of the range");
        int h=in.nextInt();
        System.out.println("Prime Number between "+l+" and "+h+" are");
        for(int i=l;i<=h;i++) {
            for(int j=2;j<i/2;j++) {
                if(i%j==0) {
                    c++;
                }
            }
            if(c==0 && i!=1) {
                System.out.println(i);
            }
            c=0;
        }
    }

}
