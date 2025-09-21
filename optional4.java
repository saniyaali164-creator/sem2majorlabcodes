public class optional4 {
    public static void main(String[] args){
        // Checking Leap Year

                int year = 2100;

                int n = year % 4;
                int y = year % 100;
                int z = year % 400;

                if ((n == 0 && y != 0) || (z == 0)) {
                    System.out.println("It is a leap year");
                } else {
                    System.out.println("It is not a leap year");
                }
            }
        }
