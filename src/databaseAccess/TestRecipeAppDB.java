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
        recipe = new Recipe("yoyo boog",null,null,"dapfel10@gmail.com",new Date(23423432));
        response = db.addRecipe(recipe);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(response);
    }
    
}
