import java.util.*;

class SumOfNNatural{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to calculate the sum of first n natural numbers:");
        int n = sc.nextInt();

        int sum = (n * (n + 1)) / 2; // Using the formula for the sum of first n natural numbers
        
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}