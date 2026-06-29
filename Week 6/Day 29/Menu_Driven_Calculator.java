import java.util.*;
public class Menu_Driven_Calculator {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("This a calculator");
        double result=0;
        int exit=0;
        int flag=0;
        while(exit==0){
        System.out.println("Choose any one action");
        System.out.println("1.Addition(+)");
        System.out.println("2.Subtraction(-)");
        System.out.println("3.Multiplication(*)");
        System.out.println("4.Division(/)");
        System.out.println("5.Power of a number(a^b)");
        System.out.println("6.Factorial of a number(!)");
        System.out.println("7.Logarithm with base e ");
        System.out.println("8.Logarithm with base 10");
        System.out.println("9.Sine of a angle ");
        System.out.println("10.Cosine of a angle");
        System.out.println("11.Tangent of a angle");
        int action = in.nextInt();
        switch(action){
            case 1:   
                double a=0;
                if(flag==0){
                    System.out.println("Enter the first number");
                    a=in.nextDouble();
                }
                else{
                    a=result;
                }
                System.out.println("Enter the second number");
                double b=in.nextDouble();
                result=a+b;
                System.out.println(a+"+"+b+" : "+result);
                System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                int choice=in.nextInt();
                if(choice==1){
                    flag=1;
                }
                else if(choice==2){
                    flag=0;
                }
                else{
                    exit=1;
                    break;
                }
                break;
            case 2:
                double a2=0;
                if(flag==0){
                    System.out.println("Enter the first number");
                    a2=in.nextDouble();
                }
                else{
                    a2=result;
                }
                System.out.println("Enter the second number");
                double b2=in.nextDouble();
                result=a2-b2;
                System.out.println(a2+"-"+b2+" : "+result);
                System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                int choice2=in.nextInt();
                if(choice2==1){
                    flag=1;
                }
                else if(choice2==2){
                    flag=0;
                }
                else{
                    exit=1;
                    break;
                }
                break;
            case 3:
                double a3=0;
                if(flag==0){
                    System.out.println("Enter the first number");
                    a3=in.nextDouble();
                }
                else{
                    a3=result;
                }
                System.out.println("Enter the second number");
                double b3=in.nextDouble();
                result=a3*b3;
                System.out.println(a3+"*"+b3+" : "+result);

                System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                int choice3=in.nextInt();
                if(choice3==1){
                    flag=1;
                }
                else if(choice3==2){
                    flag=0;
                }
                else{
                    exit=1;
                    break;
                }
                break;
            case 4:
                double a4=0;
                if(flag==0){
                    System.out.println("Enter the first number");
                    a4=in.nextDouble();
                }
                else{
                    a4=result;
                }
                System.out.println("Enter the second number");
                double b4=in.nextDouble();
                result=a4/b4;
                System.out.println(a4+"/"+b4+" : "+result);
                System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                int choice4=in.nextInt();
                if(choice4==1){
                    flag=1;
                }
                else if(choice4==2){
                    flag=0;
                }
                else{
                    exit=1;
                    break;
                }
                break;
            case 5:
                double a5=0;
                if(flag==0){
                    System.out.println("Enter the first number");
                    a5=in.nextDouble();
                }
                else{
                    a5=result;
                }
                System.out.println("Enter the second number");
                double b5=in.nextDouble();
                result=Math.pow(a5, b5);
                System.out.println(a5+"^"+b5+" : "+result);
                System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                int choice5=in.nextInt();
                if(choice5==1){
                    flag=1;
                }
                else if(choice5==2){
                    flag=0;
                }
                else{
                    exit=1;
                    break;
                }
                break;
            case 6:
                int a6=0;
                double fact=1;
                if(flag==0){
                    System.out.println("Enter the number");
                    a6=in.nextInt();
                }
                else{
                    if(result%1!=0){
                        System.out.println("Factorial is only calculated for integers");
                        System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                        int choice6=in.nextInt();
                        if(choice6==1){
                        flag=1;
                        }
                        else if(choice6==2){
                        flag=0;
                        }
                        else{
                        exit=1;
                        break;
                    }
                    break;
                    }
                    else{         
                       a6=(int)result;
                    }
                }
                for(int i=1;i<=a6;i++){
                    fact=fact*i;
                }
                result=fact;
                System.out.println(a6+"! : "+result);
                System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                int choice6=in.nextInt();
                if(choice6==1){
                    flag=1;
                }
                else if(choice6==2){
                    flag=0;
                }
                else{
                    exit=1;
                    break;
                }
                break;
            case 7:
                double a7=0;
                if(flag==0){
                    System.out.println("Enter the number");
                    a7=in.nextDouble();
                }
                else{
                    a7=result;
                }
                result=Math.log(a7);
                System.out.println("Log base e of "+a7+" is : "+result);
                System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                int choice7=in.nextInt();
                if(choice7==1){
                    flag=1;
                }
                else if(choice7==2){
                    flag=0;
                }
                else{
                    exit=1;
                    break;
                }
                break;
            case 8:
                double a8=0;
                if(flag==0){
                    System.out.println("Enter the number");
                    a8=in.nextDouble();
                }
                else{
                    a8=result;
                }
                result=Math.log10(a8);
                System.out.println("Log base 10 of "+a8+" is : "+result);
                System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                int choice8=in.nextInt();
                if(choice8==1){
                    flag=1;
                }
                else if(choice8==2){
                    flag=0;
                }
                else{
                    exit=1;
                    break;
                }
                break;
            case 9:
                double a9=0;
                if(flag==0){
                    System.out.println("Enter the angle in degree");
                    a9=in.nextDouble();
                }
                else{
                    a9=result;
                }
                a9=Math.toRadians(a9);
                result=Math.sin(a9);
                System.out.println("Sine of "+Math.toDegrees(a9)+" is : "+result);
                System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                int choice9=in.nextInt();
                if(choice9==1){
                    flag=1;
                }
                else if(choice9==2){
                    flag=0;
                }
                else{
                    exit=1;
                    break;
                }
                break;
            case 10:
                double a10=0;
                if(flag==0){
                    System.out.println("Enter the angle in degree");
                    a10=in.nextDouble();
                }
                else{
                    a10=result;
                }
                a10=Math.toRadians(a10);
                result=Math.cos(a10);
                System.out.println("Cosine of "+Math.toDegrees(a10)+" is : "+result);
                System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                int choice10=in.nextInt();
                if(choice10==1){
                    flag=1;
                }
                else if(choice10==2){
                    flag=0;
                }
                else{
                    exit=1;
                    break;
                }
                break;
            case 11:
                double a11=0;
                if(flag==0){
                    System.out.println("Enter the angle in degree");
                    a11=in.nextDouble();
                }
                else{
                    a11=result;
                }
                a11=Math.toRadians(a11);
                result=Math.tan(a11);
                System.out.println("Tan of "+Math.toDegrees(a11)+" is : "+result);
                System.out.println("Enter 1 to perfrom more calculations on the result ,2 to start a fresh new calculation or any other number to close the program");
                int choice11=in.nextInt();
                if(choice11==1){
                    flag=1;
                }
                else if(choice11==2){
                    flag=0;
                }
                else{
                    exit=1;
                    break;
                }
                break;
            default:
                System.out.println("Please choose carefully from the listed option!! Thank You");
                exit=1;
                break;
        }
    }
    }
}
