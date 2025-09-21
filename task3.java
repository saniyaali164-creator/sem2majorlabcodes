public class task3 {
    public static void main(String[] args){
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces first
            for (int s = 1; s <= i; s++) {
                System.out.print(s);
            }
            
            System.out.println(); // Move to next line
        }
    }
}
