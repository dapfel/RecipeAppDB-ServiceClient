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
        Recipe recipeResponse = null;
        String response = "dsfsaf";
        try {     
        recipe = new Recipe("chicken", "nice chiken to eat", recipeType.MAIN, skillLevel.PRO,"dapfel10@gmail.com", new Date(System.currentTimeMillis()));
        recipeResponse = db.addRecipe(recipe);
        System.out.println(recipeResponse.getDescription());
        recipe = db.getRecipe(4);
        System.out.println(recipe.getDescription());
        recipe = db.addComment(4,new Comment("dapfel10@gmail.com","its so good!!!!", "Daniel Apfel"));
        System.out.println(response);
        recipe = db.addPicture(4, new byte[10000]);
        System.out.println(response);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }    
    }
    
}
