//Write a Java program to check whether a number is prime or not.
public class task2 {
    public static void main(String[] args){
        int num = 12;
        if(num<=1){
            System.out.println("Not Prime");
        return;}
        for(int i =2 ; i<=num/2; i++){
         if(num%i==0) {
             System.out.println("Not prime");
             break;
         }
         else {
             System.out.println("Prime");
         }
        }
    }
}
