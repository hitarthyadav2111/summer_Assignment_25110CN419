import java.util.*;
public class To_Convert_Binary_to_Decimal {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the binary number");
        int b=in.nextInt();
        int b1=b,b2=b;
        int c=0,d=0;
        while(b1!=0) {
            b1=b1/10;
            c++;
        }
        int a=0;
        for(int i=1;i<=c;i++) {
            d=d + (b%10)*(int)Math.pow(2,a++);
            b=b/10;
        }
        System.out.println("The decimal equivalent of "+b2+" is "+d);
}
}
