import java.util.*;
public class To_Create_ATM_Simulation {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Which type of bank account do you have");
        System.out.println("1.SAVINGS ACCOUNT");
        System.out.println("2.CURRENT ACCOUNT");
        int a=in.nextInt();
        double balance=14500.00;
        int flag=1;
        while(flag==1){
        if(a==1||a==2){
            System.out.println("Which action would you like to perform ");
            System.out.println("1.CHECK BALANCE");
            System.out.println("2.ADD BALANCE");
            System.out.println("3.WITHDRAW CASH");
            System.out.println("Choose anyone from 1,2,3");
            int choice=in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Account Balance : Rs."+balance);
                    break;
                case 2:
                    int five=0,two=0,one=0;
                    System.out.println("Please put the cash in the slot");
                    System.out.print("Rs.500 notes : ");
                    five=in.nextInt();
                    System.out.print("Rs.200 notes : ");
                    two=in.nextInt();
                    System.out.print("Rs.100 notes : ");
                    one=in.nextInt();
                    int add=500*five+200*two+100*one;
                    balance=balance+add;
                    System.out.println("Available balance : Rs."+balance);
                    break;
                case 3:
                    System.out.println("How much cash do you want to withdraw");
                    int cash=in.nextInt();
                    if(cash>balance){
                        System.out.println("Insufficient Balance!");
                    }
                    else if(cash>10000){
                        System.out.println("You cannot withdraw more than Rs.10000 in a single transaction");
                    }
                    else if(cash%100!=0){
                        System.out.println("Enter the amount in multiple of 100");
                    }
                    else{
                        balance=balance-cash;
                        System.out.println("Available Balance : Rs."+balance);
                    }
                    break;
                default:
                    System.out.println("Invalid Choice !!!");
                    break;
                }
                System.out.println("Press 1 if you want to perform any other action and 0 to exit ");
                int check=in.nextInt();
                if(check==1){
                    flag=1;
                }
                else{
                    System.out.println("Thank You. Have a nice day.");
                    flag=0;
                }
            }
            else{
            System.out.println("Invalid Choice");
            }
        }
    }
}
