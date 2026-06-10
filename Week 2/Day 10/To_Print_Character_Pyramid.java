public class To_Print_Character_Pyramid {
    public static void main(String args[]) {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5-i;j++) {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print((char)('A'+k-1)+" ");
            }
            for(int l=1;l<=i-1;l++) {
                System.out.print((char)('A'+i-l-1)+" ");
            }
            System.out.println(); 
    }
}
}