import java.util.*;
public class To_Find_Sum_and_Average_of_Array {
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
        int sum=0;double avg=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        avg=(double)sum/n;
       System.out.println("The sum of the array is "+sum+" and the average is "+avg); 

}
}

