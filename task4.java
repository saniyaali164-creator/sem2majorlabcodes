import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        System.out.println("Enter value for n:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double sum = 0.0;
        for(int i = 1; i <= n; i++){
            sum = sum + 1.0/i;
        }
        System.out.println("sum = " + sum);
    }
}
