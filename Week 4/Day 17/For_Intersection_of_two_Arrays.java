import java.util.*;
public class For_Intersection_of_two_Arrays {
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
        int f=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    f++;
                }
            }
        }
        int k=0;
        int c[]=new int[f];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    boolean p=false;
                    for(int l=0;l<k;l++){
                        if(c[l]==a[i]){
                            p=true;
                            break;
                        }
                    }
                    if(!p){
                        c[k++]=a[i];
                    }
                }
            }
        }
        System.out.println("The array after intersection of the given arrays is");
        for(int i=0;i<f;i++) {
            System.out.print(c[i]+" ");
     }
    }
}


