import java.util.*;
public class To_Print_Half_Pyramid {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many rows of the pyramid do you want to print");
        int n= in.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
