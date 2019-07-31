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
        String response = "etwerw";
        try {
        UserProfile user = db.getUser("dapfel10@gmail.com");
        response = db.forgotPassword("dapfel10@gmail.com");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(response);
        
    }
    
}
