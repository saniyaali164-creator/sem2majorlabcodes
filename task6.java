import java.util.Scanner;
public class task6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int fact = 1;
        for(int i=1; i <= num; i++){
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }
}
