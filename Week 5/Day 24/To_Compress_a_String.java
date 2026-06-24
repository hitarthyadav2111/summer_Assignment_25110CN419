import java.util.*;
public class To_Compress_a_String {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=in.next();
        int l=str.length();
        String str1=str;
        String comp= "";
        char ch=' ',ch1=' ';
        int count=0;
        for(int i=0;i<l;i++){
            ch=str.charAt(i);
            if(ch==' ')
                continue;
            for(int j=0;j<l;j++){
                ch1=str.charAt(j);
                if(ch==ch1){
                    count++;
                }
            }
            str=str.replace(ch,' ');
            comp=comp+ch+count;
            count=0;
        }
        if(comp.length()<l)
            System.out.println("Compressed String = "+comp);
        else
            System.out.println("The string cannot be compressed further , so compressed string = "+str1);
    }
}
