import java.util.*;
public class Salary_Management_System {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name=in.nextLine();
        System.out.println("Enter the basic salary");
        double bs=in.nextDouble();
        System.out.println("Enter the HRA(House Rent Allowance)");
        double hra=in.nextDouble();
        System.out.println("Enter the transport allowance");
        double ta=in.nextDouble();
        System.out.println("Enter the bonus received");
        double bonus=in.nextDouble();
        System.out.println("Enter the ovrtime pay");
        double op=in.nextDouble();
        double mgross=bs+hra+ta+bonus+op;
        double pfdeduction=bs*0.12;  //Provident fund rate ,usually 12% as per google
        double annualgrosssal=mgross*12;
        double taxable_income=annualgrosssal-75000;
        double tds=0.00;
        if(taxable_income<=400000.00){
            tds=0;
        }
        else if(taxable_income>=400001 && taxable_income<=800000){
            tds=0.05*taxable_income;
        }
        else if(taxable_income>=800001 && taxable_income<=1200000){
            tds=0.10*taxable_income;
        }
        else if(taxable_income>=1200001 && taxable_income<=1600000){
            tds=0.15*taxable_income;
        }
        else if(taxable_income>=1600001 && taxable_income<=2000000){
            tds=0.20*taxable_income;
        }
        else if(taxable_income>2000001 && taxable_income<=2400000){
            tds=0.25*taxable_income;
        }
        else{
            tds=0.30*taxable_income;
        }
        double monthlytax=tds/12;
        double net_salary=mgross-(pfdeduction+monthlytax);
        System.out.println("Employee's Name : "+name);
        System.out.println("The Net Monthly Salary will be : "+net_salary);
    }
}
