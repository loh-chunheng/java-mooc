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

public class RecipeBook {
    private ArrayList<Recipe> recipes;
    
    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }
    
    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }    
    
    public ArrayList<Recipe> findName(String nameToSearch) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().contains(nameToSearch)) {
                foundRecipes.add(recipe);
            }
        }
        
        return foundRecipes;
    }
    
    public ArrayList<Recipe> findCookingTime(int maxTime) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        
        for (Recipe recipe: this.recipes) {
            if (recipe.getTime() <= maxTime) {
                foundRecipes.add(recipe);
            }
        }
        
        return foundRecipes;
    }
    
    public ArrayList<Recipe> findIngredient(String ingredientToSearch) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        
        for (Recipe recipe: this.recipes) {
            if (recipe.getIngredients().contains(ingredientToSearch)) {
                foundRecipes.add(recipe);
            }
        }
        
        return foundRecipes;
    }
    
}
