import java.util.*;
public class Function_To_Find_Sum_Of_Two_Number {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers respectively");
        int a=in.nextInt();
        int b=in.nextInt();
        Function_To_Find_Sum_Of_Two_Number ob= new Function_To_Find_Sum_Of_Two_Number();
        int s=ob.sum(a,b);
        System.out.println("The sum of "+a+" and "+b+" is "+s);
    }
    int sum(int m,int n) {
        return m+n;
    }
}
