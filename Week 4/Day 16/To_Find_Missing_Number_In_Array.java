import java.util.*;
public class To_Find_Missing_Number_In_Array {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Till which  number do you want the list ");
        int n= in.nextInt();
        int a[]=new int[n-1];
        System.out.println("Enter the terms in the array except any one number");
        for(int i=0;i<n-1;i++) {
            a[i]=in.nextInt();
        }
        System.out.println("The array entered is");
        for(int i=0;i<n-1;i++) {
            if(i!=n-2)
            System.out.print(a[i]+",");
            else
            System.out.println(a[i]);
        }
        int sum=n*(n+1)/2;
        int arrsum=0;
        for(int i=0;i<n-1;i++){
            arrsum=arrsum+a[i];
        }
        int misnum=sum - arrsum;
        System.out.println("The missing number is "+misnum);
}
}