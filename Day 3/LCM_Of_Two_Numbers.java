import java.util.*;
public class LCM_Of_Two_Numbers {
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=in.nextInt();
        System.out.println("Enter the second number");
        int b=in.nextInt();
        int remainder=1,max,min;
        max=Math.max(a,b);
        min=Math.min(a,b);
        while(remainder!=0)
        {
            remainder=max%min;
            max=min;
            if(remainder!=0)
            min=remainder;
        }
        int gcd=min;
        int lcm= Math.abs(a*b)/gcd;
        System.out.println("The LCM of "+a+" and "+b+" is "+lcm);
    }
    
}
