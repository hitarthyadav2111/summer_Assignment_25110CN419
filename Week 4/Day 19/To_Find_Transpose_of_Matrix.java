import java.util.*;
public class To_Find_Transpose_of_Matrix {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix");
        int r=in.nextInt();
        System.out.println("Enter the number of coulumns of matrix");
        int c=in.nextInt();
        System.out.println("Enter the values in the matrix");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("The given matrix is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int b[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[j][i]=a[i][j];
            }
        }
        System.out.println("The transpose matrix of the given matrix is");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
