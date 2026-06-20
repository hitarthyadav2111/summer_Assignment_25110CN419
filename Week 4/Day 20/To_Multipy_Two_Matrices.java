import java.util.*;
public class To_Multipy_Two_Matrices {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of first matrix");
        int r1=in.nextInt();
        System.out.println("Enter the number of coulumns of first matrix");
        int c1=in.nextInt();
        System.out.println("Enter the values in the first matrix");
        int a[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("The first matrix is ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the number of rows of second matrix");
        int r2=in.nextInt();
        System.out.println("Enter the number of coulumns of second matrix");
        int c2=in.nextInt();
        System.out.println("Enter the values in the second matrix");
        int b[][]=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=in.nextInt();
            }
        }
        System.out.println("The second matrix is ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int p[][]=new int[r1][c2];
        if(c1==r2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c2;k++){
                        p[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("The product of the given matrices is ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
        } 
        else{
            System.out.println("The given matrices cannot be multiplied since the number columns of the first matrix are not equal to the number of rows of the second matrix");
        }
    }   
}
