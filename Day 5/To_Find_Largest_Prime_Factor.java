import java.util.*;
public class To_Find_Largest_Prime_Factor {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        System.out.print("The largest prime factor of the given number "+n+" is = ");
        int p=0,c=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                for(int j=2;j<=i/2;j++) {
                    if(i%j==0) {
                        c++;
                    }
                }
                if(c==0){
                    p=i;
                }
                c=0;
            }
        }
        System.out.println(p);
    }
    
}
