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
    private TodoList Todo;
    
    public UserInterface(TodoList Todo, Scanner scanner) {
        this.scanner = scanner;
        this.Todo = Todo;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            processCommand(input);
        }
    }
    
    public void processCommand(String input) {
        if (input.equals("add")) {
            add();
        } else if (input.equals("list")) {
            list();
        } else if (input.equals("remove")) {
            remove();
        } else {
            System.out.println("Command not valid!");
        }
    }
    
    public void add() {
        System.out.println("To add:");
        String task = scanner.nextLine();
        
        this.Todo.add(task);
    }
    
    public void list() {
        this.Todo.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed?");
        int number = Integer.valueOf(scanner.nextLine());
        
        this.Todo.remove(number);
    }
    
}
