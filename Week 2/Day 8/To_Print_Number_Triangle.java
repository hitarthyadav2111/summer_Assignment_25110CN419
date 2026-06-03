import java.util.*;
public class To_Print_Number_Triangle {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        for (int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
