/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseAccess;

import java.io.IOException;

/**
 *
 * @author dapfe
 */
public class TestRecipeAppDB {
    
    public static void main(String[] args) {
        
        DatabaseService db = new DatabaseService();
        UserProfile user = null;
        try {
            user = db.validateSignIn("da@gmail.com","password");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
            
        if (user == null)
            System.out.println(user);
        else
            System.out.println(user.getEmail());
        
    }
    
}
