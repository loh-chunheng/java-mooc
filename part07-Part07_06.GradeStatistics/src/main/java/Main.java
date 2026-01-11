
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoursePoint coursePoint = new CoursePoint();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        UserInterface userInterface = new UserInterface(scanner, coursePoint);
        
        userInterface.start();
    }
}
