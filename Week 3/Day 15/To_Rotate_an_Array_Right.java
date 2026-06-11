import java.util.*;
public class To_Rotate_an_Array_Right {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m=in.nextInt();
        System.out.println("Enter the number of columns");
        int n=in.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the numbers in the array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Original array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"   ");
            }
            System.out.println();
        }
        int b[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j]=a[m-j-1][i];
            }
        }
        System.out.println("The array after being rotated to the right is");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(b[i][j]+"   ");
            }
            System.out.println();
        }
}
}
