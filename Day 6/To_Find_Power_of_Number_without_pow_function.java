import java.util.*;
public class To_Find_Power_of_Number_without_pow_function {
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int x=in.nextInt();
        System.out.println("Enter the power ");
        int n=in.nextInt();
        int r=1;
        for(int i=1;i<=n;i++) {
            r=r*x;
        }
        System.out.println(x+"^"+n+" will be "+r);

    }
    
}
