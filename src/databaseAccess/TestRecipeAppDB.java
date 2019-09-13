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
        String[] cuisines = new String[2];
        cuisines[0] = "asian"; 
        cuisines[1] = "european";
        UserProfile user = null;
        try {     
        user = db.updateUserProfileString("dapfel10@gmail.com","password","Daniel","Apfel","USA",cuisines,skillLevel.PRO);    
            
        user = db.updateUserProfileString("dapfel10@gmail.com",null,null,null,null,null,null);  
           
        System.out.println(user.getCuisines().get(0) + "  " + user.getCountry() + user.getCookingSkills());
        } 
        catch (Exception e) {
            e.printStackTrace();
        }    
    }
    
}
