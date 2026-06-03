import java.util.*;
public class To_Check_Perfect_Number {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number you want to check ");
        int n=in.nextInt();
        int s=0;
        for(int i=1;i<=n/2;i++) {
            if(n%i==0) {
                s=s+i;
            }
        }
        if(s==n) {
            System.out.println(n+ " is a Perfect Number");
        }
        else {
            System.out.println(n+ " is not a Perfect Number");
        }
    }
    
}
