
/**
 * A test class for the Ingredient class.
 * Ensures that the Ingredient class is working as intended.
 */
public class IngredientTest {

    @Test
    public void TestA () {
        String param = "1;\"tsp\";\"Salt\"";
        Ingredient i = new Ingredient(param);
        
    }

    @Test
    public void TestB () {
        String param = "1;\"\";\"New York Strip\"";
    }
}