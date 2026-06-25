import java.util.*;
public class To_Merge_Two_Sorted_Arrays {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int m=in.nextInt();
        System.out.println("Enter the size of the second array");
        int n=in.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        System.out.println("Enter the numbers in the first array in sorted manner only");
        for (int i=0;i<m;i++){
            a[i]=in.nextInt();
        }
        System.out.println("The first array is ");
        for (int i=0;i<m;i++) {
            if(i==0){
                System.out.print("["+a[i]+",");
            }
            else if(i==m-1){
                System.out.println(a[i]+"]");
            }
            else{
                System.out.print(a[i]+",");
            }
        }
        System.out.println("Enter the numbers in the second array in sorted manner only");
        for (int i=0;i<n;i++){
            b[i]=in.nextInt();
        }
        System.out.println("The second array is ");
        for (int i=0;i<n;i++) {
            if(i==0){
                System.out.print("["+b[i]+",");
            }
            else if(i==n-1){
                System.out.println(b[i]+"]");
            }
            else{
                System.out.print(b[i]+",");
            }
        }
        int c[]=new int[m+n];
        for(int i=0;i<m;i++){
            c[i]=a[i];
        }
        for(int i=0;i<n;i++){
            c[m+i]=b[i];
        }
        for(int i=0;i<m+n-1;i++){
            for(int j=0;j<m+n-1-i;j++){
                if(c[j]>c[j+1]){
                    int temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
        System.out.println("The new merged array is ");
        for (int i=0;i<m+n;i++) {
            if(i==0){
                System.out.print("["+c[i]+",");
            }
            else if(i==m+n-1){
                System.out.println(c[i]+"]");
            }
            else{
                System.out.print(c[i]+",");
            }
        }
    }
}
