//Recently learned about arrraylist in java framework so implemented it here and previous problem
import java.util.*;
public class Employee_Management_System {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("This a employee record system");
        List<String> employeeid=new ArrayList<>();
        List<String> name=new ArrayList<>();
        List<String> dob=new ArrayList<>();
        List<String> email=new ArrayList<>();
        List<String> contact=new ArrayList<>();
        List<String> emcontact=new ArrayList<>();
        List<String> designation=new ArrayList<>();
        List<String> department=new ArrayList<>();
        List<String> supervisor=new ArrayList<>();
        List<String> dateofjoining=new ArrayList<>();
        while(true){
            System.out.println("Enter the Employee ID");
            String e=in.nextLine();
            employeeid.add(e);
            System.out.println("Enter Employee's name");
            String n=in.nextLine();
            name.add(n);
            System.out.println("Enter the Date of Birth in DD/MM/YYYY format");
            String d=in.nextLine();
            dob.add(d);
            System.out.println("Enter the email id of the employee");
            String em=in.nextLine();
            email.add(em);
            System.out.println("Enter the contact number");
            String c=in.nextLine();
            contact.add(c);
            System.out.println("Enter the emergency contact");
            String ec=in.nextLine();
            emcontact.add(ec);
            System.out.println("Enter the employee's designation");
            String de=in.nextLine();
            designation.add(de);
            System.out.println("Enter employee's department");
            String dep=in.nextLine();
            department.add(dep);
            System.out.println("Enter the employee's supervisor's ID");
            String s=in.nextLine();
            supervisor.add(s);
            System.out.println("Enter the date of joining of the employee in the company in DD/MM/YYYY format");
            String doj=in.nextLine();
            dateofjoining.add(doj);
            System.out.println("Press 1 to input next employee's record ,to move to next menu input any other number");
            int choice=in.nextInt();
            in.nextLine();
            if(choice!=1){
                break;
            }
        }
        System.out.println("Which action do you want to perfom");
        System.out.println("1.See the data of all the employees");
        System.out.println("2.See the data of a specfic employee by entering the Employee ID");
        System.out.println("Any other number to EXIT");
        int a=in.nextInt();
        in.nextLine();
        switch(a){
            case 1:
                for(int i=0;i<employeeid.size();i++){
                    System.out.println("Employee ID : "+employeeid.get(i));
                    System.out.println("Name : "+name.get(i));
                    System.out.println("Date of Birth : "+dob.get(i));
                    System.out.println("Email Address : "+email.get(i));
                    System.out.println("Contact Number : "+contact.get(i));
                    System.out.println("Emergency Contact : "+emcontact.get(i));
                    System.out.println("Employee's Designation : "+designation.get(i));
                    System.out.println("Department : "+department.get(i));
                    System.out.println("Suppervisor's ID : "+supervisor.get(i));
                    System.out.println("Date of Joining : "+dateofjoining.get(i));
                    System.out.println("  ");
                }
                break;
            case 2:
                while(true){
                    System.out.println("Enter the Employee ID of the student");
                    String check=in.nextLine();
                    int flag=0;
                    for(int i=0;i<employeeid.size();i++){
                        if(check.equals(employeeid.get(i))){
                            System.out.println("Employee ID : "+employeeid.get(i));
                            System.out.println("Name : "+name.get(i));
                            System.out.println("Date of Birth : "+dob.get(i));
                            System.out.println("Email Address : "+email.get(i));
                            System.out.println("Contact Number : "+contact.get(i));
                            System.out.println("Emergency Contact : "+emcontact.get(i));
                            System.out.println("Employee's Designation : "+designation.get(i));
                            System.out.println("Department : "+department.get(i));
                            System.out.println("Suppervisor's ID : "+supervisor.get(i));
                            System.out.println("Date of Joining : "+dateofjoining.get(i));
                            System.out.println("  ");
                            flag=1;
                        }
                    }
                    if(flag!=1)
                        System.out.println("Incorrect Employee ID");
                        System.out.println("Do you want to see data of any other employee");
                        System.out.println("1.YES");
                        System.out.println("2.NO");
                        int choice2=in.nextInt();
                        in.nextLine();
                        if(choice2!=1){
                            System.out.println("Thank You!!");
                            break;
                        }
                }
                break;
            default:
                System.out.println("Thank You!!");
                break;
        }
    }
}
