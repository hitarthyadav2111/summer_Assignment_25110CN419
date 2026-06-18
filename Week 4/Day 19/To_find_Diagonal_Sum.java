import java.util.*;
public class To_find_Diagonal_Sum {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the matrix");
        int n=in.nextInt();
        int a[][]=new int[n][n];
        //Since the matrix needs to be square for this program
        System.out.println("Enter the values in the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("The given matrix is ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int dsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    dsum+=a[i][j];
                }
            }
        }
        System.out.println("The sum of the diagonal entries of the given matrix is "+dsum);
    }
}
