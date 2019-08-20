/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseAccess;

import databaseAccess.Recipe.recipeType;
import databaseAccess.UserProfile.skillLevel;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author dapfe
 */
public class TestRecipeAppDB {
    
    public static void main(String[] args) {
        
        DatabaseService db = new DatabaseService();
        Recipe recipe = null;
        String response = "etwerw";
        try {     
        
        recipe = db.getRecipe(2);
        response = db.addComment(2,new Comment("dapfel10@gmail.com","yummy!!!!"));
        
        recipe = db.getRecipe(2);
        
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(recipe.getName());
        System.out.println(recipe.getAuthor());
        System.out.println(recipe.getIngredients().get("mud"));
        System.out.println(recipe.getCuisines().get(0));
        System.out.println(recipe.getInstructions().get(0));
        System.out.println(recipe.getComments().get(0).getComment());        
    }
    
}
