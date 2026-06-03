import java.util.*;
class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to generate its multiplication table:");
        int number = sc.nextInt();
        System.out.println("Multiplication Table for " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}