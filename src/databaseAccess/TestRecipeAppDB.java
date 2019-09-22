
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
            
        results = db.searchRecipes(skillLevel.BEGINNER, null, null, null, null);
           ;
        System.out.println(results.get(0).getInstructions().get(0));
        } 
        catch (Exception e) {
            e.printStackTrace();
        }    
    }
    
}
