import java.util.*;
public class Recurisve_Sum_of_Digits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        Recurisve_Sum_of_Digits ob = new Recurisve_Sum_of_Digits();
        int s=ob.Sum(n);
        System.out.println("The sum of the digits of given number "+n+" is "+s);
    }
    int Sum(int a) {
        if(a==0) {
            return 0;
        }
        else {
            return a%10 + Sum(a/10);
        }
    }
    
}
