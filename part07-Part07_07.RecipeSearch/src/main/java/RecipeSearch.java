
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        RecipeBook book = new RecipeBook();
        
        System.out.println("File to read:");
        String file = scanner.nextLine();
        RecipeSearch.readFile(file, book);
        
        System.out.println("");
        
        System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("");
        
        while (true) {
            
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            RecipeSearch.runCommand(input, book);
            System.out.println("");
            
        }
    }
    
    public static void runCommand(String command, RecipeBook book) {
        if (command.equals("list")) {
            System.out.println("");
            System.out.println("Recipes:");
            for (Recipe recipe: book.getRecipes()) {
                System.out.println(recipe);
            }
        }
        
        if (command.equals("find name")) {
            System.out.println("Searched word:");
            String wordToSearch = scanner.nextLine();
            
            System.out.println("");
            
            System.out.println("Recipes:");
            for (Recipe recipe: book.findName(wordToSearch)) {
                System.out.println(recipe);
            }
        }
        
        if (command.equals("find cooking time")) {
            System.out.println("Max cooking time:");
            int maxTime = Integer.valueOf(scanner.nextLine());
            
            System.out.println("");
            
            System.out.println("Recipes:");
            for (Recipe recipe: book.findCookingTime(maxTime)) {
                System.out.println(recipe);
            }
        }
        
        if (command.equals("find ingredient")) {
            System.out.println("Ingredient:");
            String ingredientToSearch = scanner.nextLine();
            
            System.out.println("");
            
            System.out.println("Recipes:");
            for (Recipe recipe: book.findIngredient(ingredientToSearch)) {
                System.out.println(recipe);
            }
        }
    }
    
    public static void readFile(String location, RecipeBook book) {
        try (Scanner fileScanner = new Scanner(Paths.get(location))) {
            
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                
                // Safety check: Is there a line for cooking time?
                if (!fileScanner.hasNextLine()) {
                    break;
                }
                int cookingTime = Integer.valueOf(fileScanner.nextLine());
                
                //Create the recipe object first
                Recipe newRecipe = new Recipe(name, cookingTime);
                
                //Add ingredients into the recipe object
                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    
                    newRecipe.addIngredient(ingredient);
                    
                }
                
                //Put the finished recipe into the book
                book.add(newRecipe);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
