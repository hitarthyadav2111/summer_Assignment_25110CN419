import java.util.*;
public class Student_Record_System {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("This a Student Record System");
        List<String> name=new ArrayList<>(); 
        List<Integer> rollno= new ArrayList<>();
        List<String> fname=new ArrayList<>();
        List<String> dob= new ArrayList<>();
        List<String> email=new ArrayList<>();
        List<String> contact= new ArrayList<>();
        List<String> address=new ArrayList<>();
        List<Double> gpa= new ArrayList<>();
        while(true){
            System.out.println("Enter the name of the student");
            String n=in.nextLine();
            name.add(n);
            System.out.println("Enter the Roll No. of the student");
            int r=in.nextInt();
            rollno.add(r);
            in.nextLine();
            System.out.println("Enter Father's name");
            String fn=in.nextLine();
            fname.add(fn);
            System.out.println("Enter the date of birth of the student in DD/MM/YYYY format");
            String d=in.nextLine();
            dob.add(d);
            System.out.println("Enter your email address");
            String e = in.nextLine();
            email.add(e);
            System.out.println("Enter your contact number");
            String no=in.nextLine();
            contact.add(no);
            System.out.println("Enter your address");
            String ad=in.nextLine();
            address.add(ad);
            System.out.println("Enter your recent scorecard's GPA");
            double g=in.nextDouble();
            gpa.add(g);
            System.out.println("To add data of another student press 1 ,to exit press any other number");
            int choice=in.nextInt();
            in.nextLine();
            if(choice!=1){
                break;
            }
        }
        System.out.println("Which action do you want to perfom");
        System.out.println("1.See the record of all the students");
        System.out.println("2.See the record of a specfic student by entering the Roll number");
        System.out.println("Any other number to EXIT");
        int a=in.nextInt();
        switch(a){
            case 1:
                for(int i=0;i<name.size();i++){
                    System.out.println("Name : "+name.get(i));
                    System.out.println("Roll No. : "+rollno.get(i));
                    System.out.println("Father's Name : "+fname.get(i));
                    System.out.println("Date of Birth : "+dob.get(i));
                    System.out.println("Email Address : "+email.get(i));
                    System.out.println("Contact Number : "+contact.get(i));
                    System.out.println("Student's Address : "+address.get(i));
                    System.out.println("Last Semester's GPA : "+gpa.get(i));
                    System.out.println("  ");
                }
                break;
            case 2:
                while(true){
                    System.out.println("Enter the Roll Number of the student");
                    int check=in.nextInt();
                    int flag=0;
                    for(int i=0;i<rollno.size();i++){
                        if(check==rollno.get(i)){
                            System.out.println("Name : "+name.get(i));
                            System.out.println("Roll No. : "+rollno.get(i));
                            System.out.println("Father's Name : "+fname.get(i));
                            System.out.println("Date of Birth : "+dob.get(i));
                            System.out.println("Email Address : "+email.get(i));
                            System.out.println("Contact Number : "+contact.get(i));
                            System.out.println("Student's Address : "+address.get(i));
                            System.out.println("Last Semester's GPA : "+gpa.get(i));
                            flag=1;
                        }
                    }
                    if(flag!=1)
                        System.out.println("No matching roll number found");
                        System.out.println("Do you want to see data of any other roll number");
                        System.out.println("1.YES");
                        System.out.println("2.NO");
                        int choice2=in.nextInt();
                        if(choice2!=1)
                            break;
                }
                break;
            default:
                System.out.println("Thank You!!");
                break;
        }

    }
}
