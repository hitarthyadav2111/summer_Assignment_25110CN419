import java.util.*;
public class Recursive_Reverse_of_Number {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        Recursive_Reverse_of_Number ob = new Recursive_Reverse_of_Number();
        int r=ob.reverse(n, 0);
        System.out.println("The reverse number of the givne number "+n+" is "+r);
    }
    int reverse(int a,int b) {
        if(a==0) {
            return b;
        }
        else {
            return reverse(a/10,b*10 + a%10);
        }

    }
}
