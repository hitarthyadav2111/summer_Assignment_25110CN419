import java.util.*;
public class Program_To_Subtract_Two_Matrices {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of matrices");
        int r=in.nextInt();
        System.out.println("Enter the number of coulumns of matrices");
        int c=in.nextInt();
        System.out.println("Enter the values in the first matrix");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("The first matrix is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the values in the second matrix");
        int b[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=in.nextInt();
            }
        }
        System.out.println("The second matrix is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int sub[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sub[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("The difference of the two matrices is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }
}
}
