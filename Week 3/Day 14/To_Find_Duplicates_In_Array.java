import java.util.*;
public class To_Find_Duplicates_In_Array {
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
        int c=0;
        int flag=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            if(c>1){
                System.out.print(a[i]+",");
                flag=1;
            }
            c=0;
        }
        if(flag==1){
            System.out.println("are the duplicates in the array");
        }
        else{
            System.out.println("There are no duplicates in the array");
        }
}
}