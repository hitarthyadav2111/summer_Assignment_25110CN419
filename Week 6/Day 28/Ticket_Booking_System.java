import java.util.*;
public class Ticket_Booking_System {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name of the passenger");
        String name=in.nextLine();
        System.out.println("Choose the departing station,enter the respective number ,choosing any other number will exit the system");
        System.out.println("1.A");
        System.out.println("2.B");
        System.out.println("3.C");
        int dep=in.nextInt();
        int rea=0,flag=0;
        if(dep==3){
            System.out.println("Choose the destination station,enter the respective number ,choosing any other number will exit the system");
            System.out.println("1.A");
            System.out.println("2.B");
            rea=in.nextInt();
            flag=1;
        }
        else if(dep==2){
            System.out.println("Choose the destination station,enter the respective number ,choosing any other number will exit the system");
            System.out.println("1.A");
            System.out.println("3.C");
             rea=in.nextInt();
            flag=1;

        }
        else if(dep==1){
            System.out.println("Choose the destination station,enter the respective number ,choosing any other number will exit the system");
            System.out.println("2.B");
            System.out.println("3.C");
            rea=in.nextInt();
            flag=1;

        }
        int seats=0;
        int av_seats=0;
        if(flag==1){  
            System.out.println("How many seats do you want to book");
            seats=in.nextInt();
        }
        if(dep==1 && rea==2){
            av_seats=15;
            if(seats<=av_seats){
                System.out.println("Seats are available");
                System.out.println("Total Booking Price "+(seats*500));
                System.err.println("Thank You!!");
            }
            else if(seats>0){
                System.out.println("We're sorry only "+av_seats+" are available");
            }
            else{
                System.out.println("No seats are available at the moment");
            }
        }
        else if(dep==1 && rea==3){
            av_seats=10;
            if(seats<=av_seats){
                System.out.println("Seats are available");
                System.out.println("Total Booking Price "+(seats*700));
                System.err.println("Thank You!!");
            }
            else if(seats>0){
                System.out.println("We're sorry only "+av_seats+" are available");
            }
            else{
                System.out.println("No seats are available at the moment");
            }
        }
        else if(dep==2 && rea==1){
            av_seats=25;
            if(seats<=av_seats){
                System.out.println("Seats are available");
                System.out.println("Total Booking Price "+(seats*1000));
                System.err.println("Thank You!!");
            }
            else if(seats>0){
                System.out.println("We're sorry only "+av_seats+" are available");
            }
            else{
                System.out.println("No seats are available at the moment");
            }
        }
        else if (dep==2 && rea==3) {
            av_seats=5;
            if(seats<=av_seats){
                System.out.println("Seats are available");
                System.out.println("Total Booking Price "+(seats*1500));
                System.err.println("Thank You!!");
            }
            else if(seats>0){
                System.out.println("We're sorry only "+av_seats+" are available");
            }
            else{
                System.out.println("No seats are available at the moment");
            }
        }
        else if (dep==3 && rea==1) {
            av_seats=0;
            if(seats<=av_seats){
                System.out.println("Seats are available");
                System.out.println("Total Booking Price "+(seats*500));
                System.err.println("Thank You!!");
            }
            else if(seats>0){
                System.out.println("We're sorry only "+av_seats+" are available");
            }
            else{
                System.out.println("No seats are available at the moment");
            }
        }
        else if(dep==3 && rea==2){
            av_seats=5;
            if(seats<=av_seats){
                System.out.println("Seats are available");
                System.out.println("Total Booking Price "+(seats*500));
                System.err.println("Thank You!!");
            }
            else if(seats>0){
                System.out.println("We're sorry only "+av_seats+" are available");
            }
            else{
                System.out.println("No seats are available at the moment");
            }
        }
        if(flag==1){
            System.out.println("Ticket ID : "+(int)(Math.random()*1000000000));
            System.out.println("Passenger's Name : "+name);
        }
    }
}
