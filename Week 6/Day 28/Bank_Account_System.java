import java.util.*;
public class Bank_Account_System {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the account number");
        String ac_num=in.nextLine();
        System.out.println("Enter the account holder's name");
        String ac_holder=in.nextLine();
        System.out.println("Enter current balance");
        double curr_bal=in.nextDouble();
        System.out.println("Enter the type of transaaction");
        System.out.println("1.Deposit");
        System.out.println("2.Withdrawal");
        int tr=in.nextInt();
        if(tr==1){
            System.out.println("Enter the amount of cash you want to deposit");
            double cash=in.nextDouble();
            curr_bal+=cash;
            System.out.println("Your transaction was successful");
            System.out.println("Transaction ID : "+(int)(Math.random()*1000000));
        }
        else if(tr==2){
            System.out.println("Enter the amount of cash you want to withdraw");
            double cash=in.nextDouble();
            if(cash<curr_bal){
                curr_bal-=cash;
                System.out.println("Your transation was successful");
                System.out.println("Transaction ID : "+(int)(Math.random()*1000000000));
            }
            else{
                System.out.println("Insufficient Balance!! ");
            }
        }
        System.out.println("Account Number : "+ac_num);
        System.out.println("Account Holder : "+ac_holder);
        System.out.println("Current Balance : "+curr_bal);
    }
}
