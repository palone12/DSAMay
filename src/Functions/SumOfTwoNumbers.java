package Functions;
import java.util.*;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the seconf number");
        int b =sc.nextInt();
        int sum = SumOFNumbers(a,b);
        System.out.println("Sum of the given two numbers is "+ sum);
    }
    public static  int SumOFNumbers (int a , int b ){
        return a+b;
    }
}
