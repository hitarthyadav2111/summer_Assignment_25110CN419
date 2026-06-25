import java.util.*;
public class To_Sort_Words_By_Length {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("How many words do you want to input");
        int n=in.nextInt();
        in.nextLine();  //to remove newline character error ,used in last problem as well but forgot to comment
        String words[]=new String[n];
        System.out.println("Enter the words ");
        for(int i=0;i<n;i++){
            words[i]=in.nextLine();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(words[j].length()>words[j+1].length()){
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }
        }
        System.out.println("The words are sorted");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+". "+words[i]);
        }
    }
}
