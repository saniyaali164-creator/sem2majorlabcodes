import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int num1 = 5;   // first number
        int num2 = 10;  // second number
        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // Swap using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("\nAfter swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }}
