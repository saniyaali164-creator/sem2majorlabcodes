import java.util.Scanner;
import java.util.HashMap;
public class op5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

                // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

                // Convert to lowercase to count uniformly (optional)
        str = str.toLowerCase();

                // Create a HashMap to store character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();

                // Traverse the string
                for (char ch : str.toCharArray()) {
                    if (ch != ' ') {  // ignore spaces
                        freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
                    }
                }

                // Print character frequencies
                System.out.println("Character frequencies:");
                for (char ch : freqMap.keySet()) {
                    System.out.println(ch + " : " + freqMap.get(ch));
                }

                sc.close();
            }
        }


