public class task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = -1;
        int fact = 1;
        int i;
        for(i=1 ; i<=num ; i++)
        {fact = i*fact;
        }
        if(num<=0)
            System.out.println("invalid");
        else{
        System.out.print("factorial " +fact);
        }
    }
}