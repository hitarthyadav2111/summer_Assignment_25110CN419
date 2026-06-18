import java.util.*;
public class binary_search {
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
        System.out.println("Enter the element you want to search");
        int x= in.nextInt();
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted array is ");
        for(int i=0;i<n;i++) {
            if(i!=n-1)
            System.out.print(a[i]+",");
            else
            System.out.println(a[i]);
        }
        int beg=0,end=n-1,mid=0;
        int flag=-1;
        while(beg<=end){
            mid=(beg+end)/2;
            if(a[mid]>x){
                end=mid-1;
            }
            else if(a[mid]<x){
                beg=mid+1;
            }
            else{
                flag=mid;
                break;
            }
        }
        if(flag==-1){
            System.out.println("The given element is not present in the array ");
        }
        else{
            System.out.println("The element is present in the array at position "+(flag+1));
        }
}
}