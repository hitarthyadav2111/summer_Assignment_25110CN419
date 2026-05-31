import java.util.*;
public class To_Check_Strong_Number {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        int r=0,fact=1,s=0;
        System.out.println("Enter the number you want to check ");
        int n=in.nextInt();
        int n1=n;
        while(n1!=0) {
            r=n1%10;
            for(int i=1;i<=r;i++) {
                fact = fact*i;
            }
            s=s+fact;
            fact=1;
            n1=n1/10;
        }
        if(s==n) {
            System.out.println(n+ " is a Strong Number");
        }
        else {
            System.out.println(n+ " is not a Strong Number");
        }
}
}