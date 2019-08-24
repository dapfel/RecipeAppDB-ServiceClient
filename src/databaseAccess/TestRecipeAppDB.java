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
        
        response = db.addComment(2,new Comment("dapfel10@gmail.com","its so good!!!!", "Daniel Apfel"));
        System.out.println(response);
        response = db.addPicture(2, new byte[10000]);
        System.out.println(response);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }    
    }
    
}
