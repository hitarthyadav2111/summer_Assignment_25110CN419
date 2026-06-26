import java.util.*;
public class To_Create_A_Voting_Eligibility_System {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("This is voting eligibility system");
        System.out.println("Are you a citizen of India");
        System.out.println("1.YES");
        System.out.println("2.NO");
        System.out.println("Enter your choice");
        int n=in.nextInt();
        if(n==2){
            System.out.println("You are not eligible to cast election votes");
        }
        else if(n==1){
            System.out.println("Enter your age");
            int age=in.nextInt();
            if(age<18){
                System.out.println("You are not yet eligible to cast election votes");
            }
            else{
                System.out.println("Do you have any kind of criminal status");
                System.out.println("1.YES");
                System.out.println("2.NO");
                System.out.println("Enter your choice");
                int c=in.nextInt();
                if(c==1){
                    System.out.println("You are disqualified , you cannot cast vote");
                }
                else if(c==2){
                    System.out.println("Are you a 'Ordinary Residence' in the specified constituency");
                    System.out.println("1.YES");
                    System.out.println("2.NO");
                    System.out.println("Enter your choice");
                    int r=in.nextInt();
                    if(r==1){
                        System.out.println("You are eligible to cast vote");
                    }
                    else if(r==2){
                        System.out.println("You are not eligible to cast vote in the specified constituency");
                    }
                    else{
                        System.out.println("!!INVALID CHOICE , ENTER EITHER 1 OR 2");
                    }
                }
                else{
                    System.out.println("!!INVALID CHOICE , ENTER EITHER 1 OR 2");
                }
            }
        }
        else{
            System.out.println("!!INVALID CHOICE , ENTER EITHER 1 OR 2");
        }
    }
}
