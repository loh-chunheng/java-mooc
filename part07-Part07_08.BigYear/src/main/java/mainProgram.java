
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdsLibrary birds = new BirdsLibrary();

        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            mainProgram.runCommand(scan, command, birds);
            System.out.println("");
        }
    }
    
    public static void runCommand(Scanner scan, String command, BirdsLibrary birds) {
        
        if (command.equals("Add")) {
            System.out.println("Name:");
            String name = scan.nextLine();
            System.out.println("Name in Latin:");
            String latinName = scan.nextLine();
            
            birds.add(new Bird(name, latinName));
        }
        
        if (command.equals("Observation")) {
            System.out.println("Bird?");
            String name = scan.nextLine();
            
            if (!birds.observation(name)) {
                System.out.println("Not a bird!");
            }
        }
        
        if (command.equals("All")) {
            birds.printAll();
        }
        
        if (command.equals("One")) {
            System.out.println("Bird?");
            String name = scan.nextLine();
            
            birds.printOne(name);
        }
    }
    
    

}
