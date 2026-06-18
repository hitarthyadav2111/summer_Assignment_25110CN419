import java.util.*;
public class To_Merge_Arrays {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of the first array ");
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
        System.out.println("Enter the size of the second array ");
        int m= in.nextInt();
        int b[]=new int[m];
        System.out.println("Enter the terms in the array");
        for(int i=0;i<m;i++) {
            b[i]=in.nextInt();
        }
        System.out.println("The array entered is");
        for(int i=0;i<m;i++) {
            if(i!=m-1)
            System.out.print(b[i]+",");
            else
            System.out.println(b[i]);
        }
        int c[]=new int[n+m];
        for(int i=0;i<n;i++){
            c[i]=a[i];
        }
        for(int i=0;i<m;i++){
            c[n+i]=b[i];
        }
        System.out.println("The array after merging the given arrays is");
        for(int i=0;i<m+n;i++) {
            if(i!=m+n-1)
            System.out.print(c[i]+",");
            else
            System.out.println(c[i]);
        }
}
}
