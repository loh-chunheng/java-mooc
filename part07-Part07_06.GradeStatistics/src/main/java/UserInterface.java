/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mulle
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private CoursePoint coursePoint;
    public UserInterface(Scanner scanner, CoursePoint coursePoint) {
        this.scanner = scanner;
        this.coursePoint = coursePoint;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(this.scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            this.coursePoint.addPoint(input);
        }
        
        System.out.println("Point average (all): " + this.coursePoint.getAverage());
        
        if (this.coursePoint.getAveragePassed() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.coursePoint.getAveragePassed());
        }
        
        System.out.println("Pass percentage: " + this.coursePoint.passPercentage());
        System.out.println("Grade Distribution:");
        this.coursePoint.printDistribution();
    }  
    
    
}
