
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age = 0;
        
        while (true) {
            
            String nameAge = scanner.nextLine();
            
            if (nameAge.equals("")) {
                break;
            }
            
            String[] parts = nameAge.split(",");
            
            
            if (Integer.valueOf(parts[1]) > age) {
                age = Integer.valueOf(parts[1]);
                name = parts[0];
            }
        }
        
        System.out.println("Name of the oldest: " + name);
    }
}
