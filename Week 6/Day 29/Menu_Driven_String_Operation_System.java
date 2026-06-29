import java.util.*;
public class Menu_Driven_String_Operation_System {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("This a string operation system");
        System.out.println("Enter a string");
        String str=in.nextLine();
        System.out.println("Enter the operation that you would like to perform");
        System.out.println("1.Reverse a string");
        System.out.println("2.Count vowels and consonants");
        System.out.println("3.To convert to lowercase to uppercase");
        System.out.println("4.To check palindrome string");
        System.out.println("5.Count words in a sentence");
        System.out.println("6.To find character frequency");
        System.out.println("7.Remove spaces from a string");
        System.out.println("8.Find first non-repeating character");
        System.out.println("9.Find first repeating character");
        System.out.println("10.To check anagram string");
        System.out.println("11.To find maximum occuring character ");
        System.out.println("12.To check string rotation");
        System.out.println("13.To find longest word");
        System.out.println("14.To compress a string");
        System.out.println("15.Remove duplicate characters");
        int choice=in.nextInt();
        switch(choice){
            case 1:
                int l = str.length();
                String rev = "";
                char ch = ' ';
                for (int i = l - 1; i >= 0; i--) {
                    ch = str.charAt(i);
                    rev = rev + ch;
                }
                System.out.println("The reverse string is " + rev);
                break;
            case 2:
                int l2 = str.length();
                char ch2 = ' ';
                int vow = 0, con = 0;
                for (int i = 0; i < l2; i++) {
                    ch2 = str.charAt(i);
                    if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' || ch2 == 'A' || ch2 == 'E'
                            || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') {
                        vow++;
                    } else if (ch2 != ' ') {
                        con++;
                    }
                }
                System.out.println("Number of vowels = " + vow);
                System.out.println("Number of consonants = " + con);
                break;
            case 3:
                int l3 = str.length();
                char ch3 = ' ';
                String str1 = "";
                for (int i = 0; i < l3; i++) {
                    ch3 = str.charAt(i);
                    if (ch3 >= 97 && ch3 <= 122) {
                        str1 = str1 + (char) (ch3 - 32);
                    } else if (ch3 >= 65 && ch3 <= 90) {
                        str1 = str1 + ch3;
                    } else {
                        str1 = str1 + ch3;
                    }
                }
                System.out.println("The uppercase version of the given string is " + str1);
                break;
            case 4:
                int l4 = str.length();
                String rev4 = "";
                char ch4 = ' ';
                for (int i = l4 - 1; i >= 0; i--) {
                    ch4 = str.charAt(i);
                    rev4 = rev4 + ch4;
                }
                if (str.equalsIgnoreCase(rev4)) {
                    System.out.println("The given string is palindrome");
                } else {
                    System.out.println("The given string is not palindrome");
                }
                break;
            case 5:
                str = str.trim();
                char ch5 = ' ';
                String str5 = "";
                int l5 = str.length();
                for (int i = 0; i < l5; i++) {
                    ch5 = str.charAt(i);
                    if (ch5 != ' ') {
                        str5 = str5 + ch5;
                    } else {
                        if (str.charAt(i - 1) != ' ') {
                            str5 = str5 + " ";
                        }
                    }
                }
                // the above sequence reduces the multiple space characters between the words to
                // a single one
                // the sequence written below counts the number of words by checking how many
                // times the space character comes
                str5 = str5 + " ";
                int count = 0;
                int l1 = str5.length();
                for (int i = 0; i < l1; i++) {
                    ch = str5.charAt(i);
                    if (ch == ' ') {
                        count++;
                    }
                }
                System.out.println("The given sentence has " + count + " words");
                break;
            case 6:
                int l6 = str.length();
                char ch6 = ' ', ch1 = ' ';
                int count6 = 0;
                // the loop skips the iteration when the the space character is
                // found because its not considered a character in english language so we don't
                // count it
                for (int i = 0; i < l6; i++) {
                    ch6 = str.charAt(i);
                    if (ch6== ' ')
                        continue;
                    for (int j = 0; j < l6; j++) {
                        ch1 = str.charAt(j);
                        if (ch6 == ch1) {
                            count6++;
                        }
                    }
                    System.out.println(ch6 + " = " + count6);
                    str = str.replace(ch6, ' ');
                    count6 = 0;
                }
                break;
            case 7:
                String str7 = "";
                char ch7 = ' ';
                int l7 = str.length();
                for (int i = 0; i < l7; i++) {
                    ch7 = str.charAt(i);
                    if (ch7 != ' ') {
                        str7 = str7 + ch7;
                    }
                }
                System.out.println("The given string after removing spaces is "+str7);
                System.out.println(str7);
                break;
            case 8:
                int l8 = str.length();
                char ch8 = ' ';
                int count8 = 0;
                for (int i = 0; i < l8; i++) {
                    ch8 = str.charAt(i);
                    if (ch8 == ' ')
                        continue;
                    for (int j = 0; j < l8; j++) {
                        if (ch8 == str.charAt(j)) {
                            count8++;
                        }
                    }
                    if (count8 == 1) {
                        System.out.println(ch8 + " is the first non repeating character");
                        break;
                    }
                    count8 = 0;
                }
                break;
            case 9:
                int l9= str.length();
                char ch9 = ' ';
                int count9 = 0;
                for (int i = 0; i < l9; i++) {
                    ch9 = str.charAt(i);
                    if (ch9 == ' ')
                        continue;
                    for (int j = 0; j < l9; j++) {
                        if (ch9 == str.charAt(j)) {
                            count9++;
                        }
                    }
                    if (count9 > 1) {
                        System.out.println(ch9 + " is the first repeating character");
                        break;
                    }
                    count9 = 0;
                }
                break;
            case 10:
                System.out.println("Enter the second word");
                String b = in.next();
                str = str.trim();
                b = b.trim();
                char ch100 = ' ', ch10 = ' ';
                int flag = 0;
                int l100 = str.length();
                int l10 = b.length();
                char c1[] = str.toCharArray();
                char c2[] = b.toCharArray();
                if (l100 != l10)
                    flag = 1;
                // replacing characters which match by a space character
                for (int i = 0; i < l100; i++) {
                    for (int j = 0; j < l10; j++) {
                        if (c1[i] == c2[j]) {
                            c1[i] = ' ';
                            c2[j] = ' ';
                        }
                    }
                }
                // checking if any other character is left besides space
                for (int i = 0; i < l100; i++) {
                    if (c1[i] != ' ')
                        flag = 1;
                }
                for (int i = 0; i < l10; i++) {
                    if (c2[i] != ' ')
                        flag = 1;
                }
                if (flag == 1) {
                    System.out.println("The given words are not anagrams");
                } else {
                    System.out.println("The given words are anagrams");
                }
                break;
                case 11:
                    str = str.trim();
                    int l11 = str.length();
                    char c[] = str.toCharArray();
                    char high = ' ';
                    int count11 = 0;
                    int max = 0;
                    for (int i = 0; i < l11; i++) {
                        if (c[i] == ' ')
                            continue;
                        for (int j = 0; j < l11; j++) {
                            if (c[i] == c[j])
                                count11++;
                        }
                        if (count11 > max) {
                            max = count11;
                            high = c[i];
                        }
                        count11 = 0;
                    }
                    System.out.println(high + " is the highest occuring character with frequency " + max);
                    break;
                case 12:
                    String word1=str;
                    System.out.println("Enter the second word");
                    String word2=in.next();
                    word1=word1.trim();
                    word2=word2.trim();
                    if(word1.length()!=word2.length()){
                        System.out.println("The given words are not rotated strings");
                    }
                    else{
                        int l12=word1.length(),flag12=0;
                        char c112[]=word1.toCharArray();
                        char c212[]=word2.toCharArray();
                        Menu_Driven_String_Operation_System ob= new Menu_Driven_String_Operation_System();
                        for(int i=0;i<l12;i++){
                            if(ob.check(c112, c212, l12)){
                                flag12=1;
                                break;
                            }
                            else{
                                c212=word2.toCharArray();
                                ob.reverse(c212,0,i);
                                ob.reverse(c212, i+1,l12-1);
                                ob.reverse(c212,0,l12-1);
                            }
                        }
                        if(flag12==1){
                            System.out.println("The given words are rotated strings");
                        }
                        else{
                            System.out.println("The given words are not rotated strings");
                        }
                    }
                    break;
                case 13:
                    str = str.trim();
                    String str13 = "";
                    int l13 = str.length();
                    char ch13 = ' ';
                    String longest = "", current = "";
                    for (int i = 0; i < l13; i++) {
                        ch13 = str.charAt(i);
                        if (ch13 != ' ') {
                            str13 = str13 + ch13;
                        } else {
                            if (str.charAt(i - 1) != ' ') {
                                str13 = str13 + " ";
                            }
                        }
                    }
                    str13 = str13 + " ";
                    int l113 = str13.length();
                    for (int i = 0; i < l113; i++) {
                        ch13 = str13.charAt(i);
                        if (ch13 != ' ') {
                            current = current + ch13;
                        } else if (ch13 == ' ') {
                            if (current.length() > longest.length()) {
                                longest = current;
                            }
                            current = "";
                        }
                    }
                    System.out.println("The longest word in the sentence is = " + longest + " and has "
                            + longest.length() + " characters");
                break;
            case 14:
                int l14 = str.length();
                String str14 = str;
                String comp = "";
                char ch14 = ' ', ch114 = ' ';
                int count14 = 0;
                for (int i = 0; i < l14; i++) {
                    ch14 = str.charAt(i);
                    if (ch14 == ' ')
                        continue;
                    for (int j = 0; j < l14; j++) {
                        ch114 = str.charAt(j);
                        if (ch14 == ch114) {
                            count14++;
                        }
                    }
                    str = str.replace(ch14, ' ');
                    comp = comp + ch14 + count14;
                    count14 = 0;
                }
                if (comp.length() < l14)
                    System.out.println("Compressed String = " + comp);
                else
                    System.out.println("The string cannot be compressed further , so compressed string = " + str14);
                break;
            case 15:
                str = str.trim();
                char c15[] = str.toCharArray();
                int l15 = str.length();
                for (int i = 0; i < l15; i++) {
                    if (c15[i] == ' ')
                        continue;
                    for (int j = i + 1; j < l15; j++) {
                        if (c15[i] == c15[j])
                            c15[j] = '$';
                    }
                }
                System.out.println("The resulting word is");
                for (int i = 0; i < l15; i++) {
                    if (c15[i] != '$')
                        System.out.print(c15[i]);
                }
                break;
            default:
                System.out.println("Choose from the listed options carefully!! Thank You");
                break;
        }
    }
    void reverse(char a[],int k,int n){
        char temp=' ';
        while(k<n){
            temp=a[k];
            a[k]=a[n];
            a[n]=temp;
            k++;
            n--;
        }
    }
    boolean check(char b[],char c[],int n1){
        int f=1;
        for(int i=0;i<n1;i++){
            if(b[i]!=c[i]){
                f=0;
                break;
            }
        }
        if(f==0)
            return false;
        else
            return true;
        }
}
