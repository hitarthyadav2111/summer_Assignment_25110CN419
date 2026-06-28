import java.util.*;
public class Contact_Management_System {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        List<String> numbers=new ArrayList<>();
        List<String> names=new ArrayList<>();
        List<String> email=new ArrayList<>();
        while(true){
            System.out.println("Enter the phone number");
            String num=in.nextLine();
            numbers.add(num);
            System.out.println("Enter the contact name");
            String name=in.nextLine();
            names.add(name);
            System.out.println("Enter the email id of the contact");
            String mail=in.nextLine();
            email.add(mail);
            System.out.println("Enter 1 to enter next contact or any other number to move to next menu");
            int next=in.nextInt();
            in.nextLine();
            if(next!=1)
                break;
        }
        while(true){
        System.out.println("Enter the name of the contact you want to see");
        String search=in.nextLine();
        int flag=0;
        for(int i=0;i<numbers.size();i++){
            if(search.equalsIgnoreCase(names.get(i))){
                flag=1;
                System.out.println("Contact Name : "+names.get(i));
                System.out.println("Contact Number : "+numbers.get(i));
                System.out.println("Email id : "+email.get(i));
            }
        }
        if(flag==0){
            System.out.println("The conatact that you are trying to search is not saved");
        }
        System.out.println("Enter 1 to see another contact or any other number to exit");
        int next=in.nextInt();
            in.nextLine();
            if(next!=1)
                break;
    }
        
    }
}
