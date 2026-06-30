import java.util.*;
public class Student_Record_System_Using_Array_and_Strings {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String name[]=new String[100];
        int rollno[] = new int[100];
        String fname[] = new String[100];
        String dob[] = new String[100];
        String email[] = new String[100];
        String contact[] = new String[100];
        String address[] = new String[100];
        String gpa[] = new String[100];
        int k=0;
        while(true){
            System.out.println("Enter the name of the student");
            name[k] = in.nextLine();
            System.out.println("Enter the Roll No. of the student");
            rollno[k]=in.nextInt();
            in.nextLine();
            System.out.println("Enter Father's name");
            fname[k] = in.nextLine();
            System.out.println("Enter the date of birth of the student in DD/MM/YYYY format");
            dob[k] = in.nextLine();
            System.out.println("Enter your email address");
            email[k] = in.nextLine();
            System.out.println("Enter your contact number");
            contact[k] = in.nextLine();
            System.out.println("Enter your address");
            address[k] = in.nextLine();
            System.out.println("Enter your recent scorecard's GPA");
            gpa[k] = in.nextLine();
            k++;
            System.out.println("To add data of another student press 1 ,to exit press any other number");
            int choice = in.nextInt();
            in.nextLine();
            if (choice != 1) {
                break;
            }
        }
        System.out.println("Which action do you want to perfom");
        System.out.println("1.See the record of all the students");
        System.out.println("2.See the record of a specfic student by entering the Roll number");
        System.out.println("Any other number to EXIT");
        int a = in.nextInt();
        switch (a) {
            case 1:
                for (int i = 0; i < k; i++) {
                    System.out.println("Name : " + name[i]);
                    System.out.println("Roll No. : " + rollno[i]);
                    System.out.println("Father's Name : " + fname[i]);
                    System.out.println("Date of Birth : " + dob[i]);
                    System.out.println("Email Address : " + email[i]);
                    System.out.println("Contact Number : " + contact[i]);
                    System.out.println("Student's Address : " + address[i]);
                    System.out.println("Last Semester's GPA : " + gpa[i]);
                    System.out.println("  ");
                }
                break;
            case 2:
                while (true) {
                    System.out.println("Enter the Roll Number of the student");
                    int check = in.nextInt();
                    int flag = 0;
                    for (int i = 0; i < k; i++) {
                        if (check == rollno[i]) {
                            System.out.println("Name : " + name[i]);
                            System.out.println("Roll No. : " + rollno[i]);
                            System.out.println("Father's Name : " + fname[i]);
                            System.out.println("Date of Birth : " + dob[i]);
                            System.out.println("Email Address : " + email[i]);
                            System.out.println("Contact Number : " + contact[i]);
                            System.out.println("Student's Address : " + address[i]);
                            System.out.println("Last Semester's GPA : " + gpa[i]);
                            System.out.println("  ");
                            flag = 1;
                        }
                    }
                    if (flag != 1)
                        System.out.println("No matching roll number found");
                    System.out.println("Do you want to see data of any other roll number");
                    System.out.println("1.YES");
                    System.out.println("2.NO");
                    int choice2 = in.nextInt();
                    if (choice2 != 1)
                        System.out.println("Exiting the program !! Thank you!!");
                        break;
                }
                break;
            default:
                System.out.println("Thank You!!");
                break;
        }
    }
}
