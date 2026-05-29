import java.util.*;
public class Check_Armstrong_Number {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number you want to check ");
        int n=in.nextInt();
        int n1=n, n2=n;
        int c=0;
        while(n1!=0) {
         n1=n1/10;
         c++;
        }
        int r=0, sum=0;
        for(int i=1;i<=c;i++) {
            r=n2%10;
            n2=n2/10;
            sum=sum+ (int)Math.pow(r,c);
        }
        if(sum==n) {
            System.out.println("The given number "+n+" is an Armstrong Number");
        }
        else {
            System.out.println("The given number "+n+" is not an Armstrong Number");
        }
    }
}
