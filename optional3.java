import java.util.Scanner;
public class optional3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of N");
        int n= sc.nextInt();
        int i;
        int sum=0;
        for(i=1;i<=100;i++){
            if(i%2==0) {
                sum=sum+i;}
        }  System.out.println("the sum of all even num from 1 to " + n + " is " + sum);
    }

}
