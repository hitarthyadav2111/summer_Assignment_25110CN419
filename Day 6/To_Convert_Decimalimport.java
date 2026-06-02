package Day 6;

public class To_Convert_Decimalimport java.util.*;
public class To_Convet_Decimal_to_Binary {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int d=in.nextInt();
        int d1=d;
        String b="",b1="";
        while(d!=0) {
            b1=b1+d%2;
            d=d/2;
        }
        int l=b1.length();
        for(int i=l-1;i>=0;i--) {
            b=b+b1.charAt(i);
        }
        System.out.println("Binary equivalent of "+d1+" is "+b);

    }
}

