import java.util.*;
public class To_Rotate_an_Array_Right {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n= in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the terms in the array");
        for(int i=0;i<n;i++) {
            a[i]=in.nextInt();
        }
        System.out.println("The array entered is");
        for(int i=0;i<n;i++) {
            if(i!=n-1)
            System.out.print(a[i]+",");
            else
            System.out.println(a[i]);
        }
        System.out.println("How many steps to the right do you want to rotate the array");
        int r=in.nextInt();
        int b[]=new int[n];
        int p=0;
        r=(r+n)%n;
        for(int i=0;i<n;i++){
            p=(i+r+n)%n;
            b[p]=a[i];
        }
        System.out.println("The array after being rotated to the right by "+r+" steps is");
        for(int i=0;i<n;i++) {
            if(i!=n-1)
            System.out.print(b[i]+",");
            else
            System.out.println(b[i]);
        }
}
}
