import java.util.*;
public class Inventory_Managment_System {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("This is a inventroy management system");
        List<String> product_name=new ArrayList<>();
        List<String> product_id=new ArrayList<>();
        List<Integer> stock=new ArrayList<>();
        while(true){
            System.out.println("Enter the product name");
            String name=in.nextLine();
            product_name.add(name);
            System.out.println("Enter the product id");
            String id=in.nextLine();
            product_id.add(id);
            System.out.println("Enter the increase in stock");
            int st=in.nextInt();
            in.nextLine();
            stock.add(st);
            System.out.println("Enter 1 to add next product or any other number to view the inventory");
            int choice=in.nextInt();
            in.nextLine();
            if(choice!=1){
                break;
            }
        }
        for(int i=0;i<product_name.size();i++){
            System.out.println("Product name : "+product_name.get(i));
            System.out.println("Product id : "+product_id.get(i));
            System.out.println("Stock : "+stock.get(i));
            System.out.println(" ");
        }
    }
}
