import java.util.Scanner;
public class To_Find_Pair_with_a_given_sum {
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
        System.out.println("Enter the sum");
        int s=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]+a[j]==s){
                    System.out.println(a[i]+" and "+a[j]+" is a valid pair");
                }
            }
        }
}
}