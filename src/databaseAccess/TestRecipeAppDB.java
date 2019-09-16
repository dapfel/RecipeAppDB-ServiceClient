/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseAccess;

import databaseAccess.Recipe.recipeType;
import databaseAccess.UserProfile.skillLevel;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dapfe
 */
public class TestRecipeAppDB {
    
    public static void main(String[] args) {
        
        DatabaseService db = new DatabaseService();
        RecipeList results;
        ArrayList<String> cuisines = new ArrayList<>();
        cuisines.add("asian"); 
        cuisines.add("european");
        UserProfile user1 = new UserProfile("sam@gmailcom","Sam","Funny",skillLevel.INTERMEDIATE,"USA",cuisines,null);
        UserProfile user2 = new UserProfile("bob@gmail.com","Bob","Bobby",skillLevel.BEGINNER,"Israel",cuisines,null);
        Comment comment = new Comment("dapfel10@gmail.com", "Sick soup my man!!!", "Daniel Apfel");
        Recipe recipe = new Recipe("chicken soup","really good soup",recipeType.SOUP, skillLevel.INTERMEDIATE,"dapfel10@gmail.com", new Date(System.currentTimeMillis()));
        try {  

            user1 = db.addUser(user1,"password");
            
        results = db.searchRecipes(null, null, null, null, "soup");
           
        System.out.println(results.get(0).getAuthor());
        } 
        catch (Exception e) {
            e.printStackTrace();
        }    
    }
    
}
