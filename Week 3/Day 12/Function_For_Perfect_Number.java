import java.util.*;
public class Function_For_Perfect_Number {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int a = in.nextInt();
        Function_For_Perfect_Number ob = new Function_For_Perfect_Number();
        ob.perfect(a);
    }
    void perfect(int n) {
        int s=0;
        for(int i=1;i<=n/2;i++) {
            if(n%i==0) {
                s=s+i;
            }
        }
        if(s==n) {
            System.out.println(n+ " is a Perfect Number");
        }
        else {
            System.out.println(n+ " is not a Perfect Number");
        }
    }
    
}
