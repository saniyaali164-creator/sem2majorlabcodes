import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        double num=sc.nextDouble();
        while(num>=10){
            num=num/2;
            System.out.println(num);}
    }}
