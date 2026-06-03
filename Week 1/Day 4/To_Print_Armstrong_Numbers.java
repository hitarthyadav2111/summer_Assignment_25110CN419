import java.util.*;
public class To_Print_Armstrong_Numbers {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the lower limit of the range");
        int l=in.nextInt();
        System.out.println("Enter the higher limit of the range");
        int h=in.nextInt();
        int i1,i2,c=0;
        int r=0;
        System.out.println("The Armstrong Number between "+l+" and "+h+ " are ");
        for(int i=l;i<=h;i++) {
            i1=i ; i2=i;
            while(i1!=0) {
                i1=i1/10;
                c++;
            }
            for(int j=1;j<=c;j++) {
                r=r+ (int)Math.pow(i2%10,c);
                i2=i2/10;
            }
            if(r==i) {
                System.out.println(i);
            }
            r=0;
            c=0;
        }

    }
}
