import java.util.*;
public class Marksheet_Generation_System {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Student ID");
        String id=in.nextLine();
        System.out.println("Enter the student name");
        String name=in.nextLine();
        System.out.println("Enter the class and section");
        String c=in.nextLine();
        List<String> subject=new ArrayList<>();
        List<Integer> theorymarks=new ArrayList<>();
        List<Integer> practicalmarks=new ArrayList<>();
        while(true){
            System.out.println("Enter the subject ID");
            String sn=in.nextLine();
            subject.add(sn);
            System.out.println("Enter the theory marks obtained in the subject");
            int tm=in.nextInt();
            theorymarks.add(tm);
            System.out.println("Enter the practical marks obtained in the subject");
            int pm=in.nextInt();
            practicalmarks.add(pm);
            System.out.println("Enter 1 to add more subjects or enter any other number to exit");
            int choice=in.nextInt();
            in.nextLine();
            if(choice!=1){
                break;
            }
        }
        int totalmarks=0;
        for(int i=0;i<theorymarks.size();i++){
            totalmarks=totalmarks+theorymarks.get(i);
        }
        for(int i=0;i<practicalmarks.size();i++){
            totalmarks=totalmarks+practicalmarks.get(i);
        }
        int permarks=(totalmarks/subject.size()*100)/100;
        int total_theory_marks=subject.size()*70;
        int total_practical_marks=subject.size()*30;
        System.out.println("Name : "+name);
        System.out.println("Student ID : "+id);
        System.out.println("Class : "+c);
        System.out.println("Subject ID \t Theory Marks \t Practical Marks \t Percentage Marks \t Grade");
        for(int i=0;i<subject.size();i++){
            int per=(theorymarks.get(i)+practicalmarks.get(i));
            char grade=' ';
            if(per>=90)
                grade='A';
            else if(per>=80 && per<90)
                grade='B';
            else if(per>=70 && per<80)
                grade='C';
            else
                grade='D';
            System.out.println(subject.get(i)+"        \t "+theorymarks.get(i)+"           \t "+practicalmarks.get(i)+"              \t "+per+"               \t "+grade);
        }
        if(totalmarks>30*subject.size()){           
             System.out.println("Status : Pass");
        }
        else{
            System.out.println("Status : Failed");
        }
        System.out.println("Total Marks : "+totalmarks);
        System.out.println("Percentage Marks : "+permarks);
    }
}
