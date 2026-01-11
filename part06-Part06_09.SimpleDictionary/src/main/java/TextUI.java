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

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary book;
    
    public TextUI(Scanner scanner, SimpleDictionary book) {
        this.scanner = scanner;
        this.book = book;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            processCommand(input);
        }
    }
    
    public void processCommand(String input) {
        if (input.equals("add")) {
            add();
        } else if (input.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }
    
    public void add() {
        System.out.println("Word:");
        String word = scanner.nextLine();
        System.out.println("Translation:");
        String translation = scanner.nextLine();
        
        this.book.add(word, translation);
    }
    
    public void search() {
        System.out.println("To be translated:");
        String word = scanner.nextLine();
        
        if (this.book.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + this.book.translate(word));
        }
    }
    

    
//    public void start() {
        
//        while  (true) {
//            System.out.println("Command: ");
//            String word = scanner.nextLine();
        
//            if (word.equals("end")) {
//                System.out.println("Bye bye!");
//                break;
//            }
            
//            if (word.equals("add")) {
//                System.out.println("Word: ");
//                word = scanner.nextLine();
//                System.out.println("Translation: ");
//                String translation = scanner.nextLine();
//                
//                this.book.add(word, translation);
                
//                continue;
//            }
            
//            if (word.equals("search")) {
//                System.out.println("To be translated: ");
//                word = scanner.nextLine();
                
//                if (this.book.translate(word) == null) {
//                    System.out.println("Word " + word + " was not found");
//                    continue;
//                }
                
//                System.out.println("Translation: " + this.book.translate(word));
                
//                continue;
//            }
            
//            System.out.println("Unkonwn command");
//        }
        
//    }
    
}
