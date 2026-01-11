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

public class BirdsLibrary {
    private ArrayList<Bird> birds;
    
    public BirdsLibrary() {
        this.birds = new ArrayList<>();
    }
    
    public void add(Bird bird) {
        this.birds.add(bird);
    }
    
    public boolean observation(String birdName) {
        for (Bird bird: this.birds) {
            if (bird.nameIsEqual(birdName)) {
                bird.observed();
                return true;
            }
        }
        
        return false;
    }
    
    public void printOne(String birdName) {
        for (Bird bird: this.birds) {
            if (bird.nameIsEqual(birdName)) {
                System.out.println(bird);
            }
        }
    }
    
    public void printAll() {
        for (Bird bird: this.birds) {
            System.out.println(bird);
        }
    }
}
