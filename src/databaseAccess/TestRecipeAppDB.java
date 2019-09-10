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
        RecipeList recipeResponse = null;
        String[] cuisines = new String[2];
        cuisines[0] = "asian"; 
        cuisines[1] = "european";
        try {     
        recipeResponse = db.searchRecipes(null,cuisines,null,null,null);
        
        for (int i = 0; i < recipeResponse.size(); i++)
            System.out.println(recipeResponse.get(i).getName());
        } 
        catch (Exception e) {
            e.printStackTrace();
        }    
    }
    
}
