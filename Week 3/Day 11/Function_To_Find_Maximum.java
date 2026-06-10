import java.util.*;
public class Function_To_Find_Maximum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        Function_To_Find_Maximum ob=new Function_To_Find_Maximum();
        int x=ob.max(a,b);
        System.out.println("Maximum of the two numbers "+a+" and "+b+" is "+x);

    }
    int max(int m,int n) {
        if(m>n) {
            return m;
        }
        else {
            return n;
        }
    }
}