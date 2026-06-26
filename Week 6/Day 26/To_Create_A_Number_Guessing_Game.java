import java.util.*;
public class To_Create_A_Number_Guessing_Game {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("This is a number guessing game");
        int flag=1;
        int k=0;
        while(flag==1){
            k++;
            int n=(int)(100*Math.random());
            System.out.println("Attempt "+k);
            System.out.println("Enter your guess");
            int guess=in.nextInt();
            if(n==guess){
                System.out.println("Congrats!! Your guess was absolutely correct");
                System.out.println("It took you only "+k+" attempts");
            }
            else{
                System.out.println("Oops!! Your guess was incorrect the correct number was "+n);
                System.out.println("Try again!!");
            }
            flag=0;
            System.out.println("Enter 1 if you want to play again or any other number if you want to quit");
            flag=in.nextInt();
        }
    }
}
