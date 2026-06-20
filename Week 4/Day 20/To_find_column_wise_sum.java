import java.util.*;
public class To_find_column_wise_sum {
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
        int cs[]=new int[c];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                cs[i]+=a[j][i];
            }
        }
        System.out.println("The column wise sum is ");
        for(int i=0;i<c;i++){
            System.out.print(cs[i]+" ");
        }
    }
}
