import java.util.Scanner;
public class To_Remove_Duplicates {
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
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]==a[i]){
                    if(a[j]!=0){
                    a[j]=0;
                    c++;
                    }
                }
            }
        }
        int b[]=new int[n-c];
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]==0 && a[j+1]!=0){
                    a[j]=a[j+1];
                    a[j+1]=0;
                }
            }
        }
        for(int i=0;i<n-c;i++){
            b[i]=a[i];
        }
        System.out.println("New array without duplicates is");
        for(int i=0;i<n-c;i++) {
            if(i!=n-c-1)
            System.out.print(b[i]+",");
            else
            System.out.println(b[i]);
        }
}
}
