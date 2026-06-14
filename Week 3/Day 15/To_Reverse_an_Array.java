import java.util.*;
public class To_Reverse_an_Array{
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
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=a[n-1-i];
        }
        System.out.println("The reversed array is ");
        for(int i=0;i<n;i++){
            if(i!=n-1)
            System.out.print(b[i]+",");
            else
            System.out.println(b[i]);
        }
}
}
