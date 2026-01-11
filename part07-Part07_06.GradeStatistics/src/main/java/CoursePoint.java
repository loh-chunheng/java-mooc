/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mulle
 */
import java.util.ArrayList;

public class CoursePoint {
    private ArrayList<Integer> points;
    
    public CoursePoint() {
        this.points = new ArrayList<>();
    }
    
    public void addPoint(Integer point) {
        if (point >= 0 && point <= 100) {
            this.points.add(point);
        }
    }
    
    public double getAverage() {
        
        if (this.points.isEmpty()) {
            return -1.0;
        }
        
        int sum = 0;
        
        for (int point: this.points) {
            sum += point;
        }
        
        return sum * 1.0 / this.points.size();
    }
    
    public ArrayList<Integer> pointsPassed() {
        ArrayList<Integer> passed = new ArrayList<>();
        
        for (int point: this.points) {
            if (point >= 50) {
                passed.add(point);
            }
        }
        
        return passed;
    }
    
    public double getAveragePassed() {
        if (this.pointsPassed().isEmpty()) {
            return -1.0;
        }
        
        int sum = 0;
        
        for (int point: this.pointsPassed()) {
            sum += point;
        }
        
        return sum * 1.0 / this.pointsPassed().size(); 
    }
    
    public double passPercentage() {
        if (this.points.isEmpty()) {
            return -1.0;
        }
        
        return 100.0 * this.pointsPassed().size() / this.points.size();
    }
    
    private ArrayList<Integer> grades() {
        ArrayList<Integer> grades = new ArrayList<>();
        
        for (int point: this.points) {
            if (point < 50) {
                grades.add(0);
            } else if (point < 60) {
                grades.add(1);
            } else if (point < 70) {
                grades.add(2);
            } else if (point < 80) {
                grades.add(3);
            } else if (point < 90) {
                grades.add(4);
            } else {
                grades.add(5);
            }
        }
        
        return grades;
    }
    
    private void printStar(int gradeToPrint) {
        for (int grade: this.grades()) {
            if  (grade == gradeToPrint) {
                System.out.print("*");
            }
        } 
    }
    
    public void printDistribution() {
        for (int grade = 5; grade >= 0; grade --) {
            System.out.print(grade + ":");
            this.printStar(grade);
            System.out.println("");
        }
    }
}
