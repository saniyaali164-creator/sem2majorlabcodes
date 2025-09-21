public class optional2 {
    public static void main(String[] args){
        int num1=1;
        int num2=6;
        int num3=9;
        int num4=5;
        int largest;
        if(num1>=num2 && num1>=num3 && num1>=num4){
            largest=num1;
        } else if(num2>=num1 && num2>=num3 && num2>=num4){
            largest=num2;
        } else if(num3>=num1 && num3>=num2 && num3>=num4){
            largest=num3;
        } else{ largest=num4;
    } System.out.println(largest + " is the largest number");
}   }

