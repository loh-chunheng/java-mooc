
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        
        while (true) {
            
            String nameAge = scanner.nextLine();
            
            if (nameAge.equals("")) {
                break;
            }
            
            String[] parts = nameAge.split(",");
            
            
            if (Integer.valueOf(parts[1]) > age) {
                age = Integer.valueOf(parts[1]);
            }
        }
        
        System.out.println("Age of the oldest: " + age);
    }
}
