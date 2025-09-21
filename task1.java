//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num=sc.nextInt();
        int d=num%2;
        if(d==0){
            System.out.println("It's even");
        }
        else{
            System.out.println("It's odd");
        }

    }
}