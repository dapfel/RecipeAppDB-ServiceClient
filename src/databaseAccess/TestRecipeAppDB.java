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
        RecipeList recipeList = null;
        String response = "etwerw";
        Comment comment = new Comment("dapfel10@gmail.com","sick recipe dude you da man");
        try {
        recipeList = db.getUsersRecipes("dapfel10@gmail.com");
        response = db.addComment(34, comment);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(response);
        
    }
    
}
