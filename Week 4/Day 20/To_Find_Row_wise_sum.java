import java.util.*;
public class To_Find_Row_wise_sum {
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
        int rs[]=new int[r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                rs[i]+=a[i][j];
            }
        }
        System.out.println("The row wise sum is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("= "+rs[i]);
        }
        
    }
}
