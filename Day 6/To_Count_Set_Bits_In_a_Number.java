import java.util.*;
public class To_Count_Set_Bits_In_a_Number {
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number ");
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
        int c=0;
        for(int i=0;i<l;i++) {
            if(b.charAt(i)=='1') {
                c++;
            }
        }
        System.out.println("Number of set bits in the given number "+d1+" are "+c);
    }
}