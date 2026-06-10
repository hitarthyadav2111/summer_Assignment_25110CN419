import java.util.*; 
public class Function_To_Check_Prime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=in.nextInt();
        Function_To_Check_Prime ob = new Function_To_Check_Prime();
        ob.prime(a);
    }
    void prime(int n) {
        int c=0;
        for(int i=2;i<=n/2;i++) {
            if(n%i==0) {
                c++;
            }
        }
        if(c==0 && n!=1) {
            System.out.println(n+" is a Prime Number");
        }
            else {
            System.out.println(n+" is not a Prime Number");
        }
    }
}

