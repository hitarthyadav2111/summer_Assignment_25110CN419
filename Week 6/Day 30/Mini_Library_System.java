import java.util.*;
public class Mini_Library_System {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("This is a mini library management system");
        
        List<String> book_id = new ArrayList<>();
        List<String> title = new ArrayList<>();
        List<String> author = new ArrayList<>();
        List<Integer> stock = new ArrayList<>();
        book_id.add("BK-2026-001");
        title.add("To Kill A Mockingbird");
        author.add("Harper Lee");
        stock.add(10);
        book_id.add("BK-2026-002");
        title.add("1984");
        author.add("George Onwell");
        stock.add(8);
        book_id.add("BK-2026-003");
        title.add("The Great Gatsby");
        author.add("F.Scott Fitzgerald");
        stock.add(11);
        book_id.add("Bk-2026-004");
        title.add("The Hobbit");
        author.add("J.R.R. Tolkien");
        stock.add(4);
        book_id.add("BK-2026-005");
        title.add("Harry Potter and the Sorcerer's Stone");
        author.add("J.K. Rowling");
        stock.add(5);
        book_id.add("BK-2026--006");
        title.add("Pride and Prejudice");
        author.add("Jane Austen");
        stock.add(14);
        book_id.add("BK-2026-007");
        title.add("The Catcher in the Rye");
        author.add("J.D. Salinger");
        stock.add(9);
        book_id.add("BK-2026-008");
        title.add("The ALchemist");
        author.add("Paulo Coelho");
        stock.add(10);
        book_id.add("BK-2026-009");
        title.add("Brave New World");
        author.add("Aldous Huxley");
        stock.add(3);
        book_id.add("BK-2026-010");
        title.add("The Da Vinvci Code");
        author.add("Dan Brown");
        stock.add(1);
        int exit=0;
        while(exit==0)
            {System.out.println("Choose any option ");
            System.out.println("1.Issue a book");
            System.out.println("2.Return a book");
            System.out.println("3.EXIT");
            int option = in.nextInt();
            switch (option) {
            case 1:
                while (true) {
                    System.out.println("Which book do you want to issue,enter the respective number");
                    for (int i = 0; i < title.size(); i++) {
                        System.out.println((i + 1) + "." + title.get(i));
                    }
                    int issued_book = in.nextInt();
                    if(issued_book>=1 && issued_book<=10){
                        
                            if (stock.get(issued_book - 1) == 0)
                                System.out.println("Book is out of stock sorry for inconvenience");
                            else{
                                System.out.println("Issuing book : " + title.get(issued_book - 1));
                                System.out.println("Book ID : " + book_id.get(issued_book - 1));  
                                stock.set(issued_book - 1, stock.get(issued_book - 1) - 1);
                            }
                    }
                    System.out.println("Enter 1 if you want to issue more books,any other number to exit to menu");
                    int a = in.nextInt();
                    if (a != 1) {
                        System.out.println("Thank You!!");
                        break;
                    }
                }
                break;
            case 2:
                while (true) {
                    System.out.println("Which book do you want to return,enter the respective number");
                    for (int i = 0; i < title.size(); i++) {
                        System.out.println((i + 1) + "." + title.get(i));
                    }
                    int returning_book = in.nextInt();
                    if(returning_book>=1 && returning_book<=10){
                        System.out.println("Returning book : " + title.get(returning_book - 1));
                        System.out.println("Book ID : " + book_id.get(returning_book - 1));
                        stock.set(returning_book - 1, stock.get(returning_book - 1) + 1);
                    }
                    System.out.println("Enter 1 if you want to return more books,any other number to exit to menu");
                    int a = in.nextInt();
                    if (a != 1) {
                        System.out.println("Thank You!!");
                        break;
                    }

                }
                break;
            default:
                System.out.println("Thank You !!");
                exit=1;
            }
        }
    }
}
