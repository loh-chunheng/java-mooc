
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // test for Part 1 & 2
        GradeRegister register = new GradeRegister();
        // register.addGradeBasedOnPoints(93);
        // register.addGradeBasedOnPoints(91);
        // register.addGradeBasedOnPoints(92);
        // register.addGradeBasedOnPoints(88);

        // System.out.println(register.averageOfGrades());
        // System.out.println(register.averageOfPoints());

        // Test for Part 3
        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
