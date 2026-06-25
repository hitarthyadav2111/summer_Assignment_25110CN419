import java.util.*;
public class To_Sort_Names_Alphabetically {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("How many names do you want to input");
        int n=in.nextInt();
        in.nextLine();
        String names[]=new String[n];
        System.out.println("Enter the names ");
        for(int i=0;i<n;i++){
            names[i]=in.nextLine();
           
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(names[j].compareTo(names[j+1])>0){
                    String temp=names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp;
                }
            }
        }
        System.out.println("The names are sorted");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+". "+names[i]);
        }
    }
}
