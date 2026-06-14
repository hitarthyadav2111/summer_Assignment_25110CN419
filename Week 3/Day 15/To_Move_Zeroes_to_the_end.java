import java.util.*;
public class To_Move_Zeroes_to_the_end {
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
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]==0 && a[j+1]!=0){
                    a[j]=a[j+1];
                    a[j+1]=0;
                }
            }
        }
        System.out.println("The new array after moving all the zeroes to the end is");
        for(int i=0;i<n;i++) {
            if(i!=n-1)
            System.out.print(a[i]+",");
            else
            System.out.println(a[i]);
        }
}
}