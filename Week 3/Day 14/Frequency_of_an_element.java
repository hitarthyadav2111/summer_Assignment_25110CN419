import java.util.*;
public class Frequency_of_an_element {
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
        System.out.println("Enter the number whose frequency is to be determined");
        int x=in.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                flag++;
            }
        }
        if(flag==0){
            System.out.println("ERROR!!! The number "+x+" is not present in the array");
        }
        else{
            System.out.println("The frequency of the number "+x+" is "+flag);
        }
}
}