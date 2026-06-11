import java.util.*;
public class Linear_Search {
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
        System.out.println("Enter the number you want to search");
        int x=in.nextInt();
        int flag=-1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                flag=i;
                break;
            }          
        }
        if(flag==-1){
            System.out.println(x+" is not present in the array");
        }
        else{
            System.out.println(x+" is present in the array at postion "+(flag+1));
        }
}
}