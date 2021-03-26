import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version 0.1
 * @author Stephen Morse
 */
public class App {
    private static String filename = "IngredientList.csv";
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("config.properties"));
            IngredientList ingredientList = new IngredientList(properties.getProperty("ingredientsFile"));
            for (int i = 0; i < ingredientList.listLength();i++) {
                System.out.println(ingredientList.getElement(i).getAmount() + " " + ingredientList.getElement(i).getMeasure() + " of " + ingredientList.getElement(i).getName());
            }
        } catch (FileNotFoundException ep) {
            System.out.println("FileNotFoundException occurred:");
            ep.printStackTrace();
        } catch (IOException ep) {
            System.out.println("IOException occurred:");
            ep.printStackTrace();
        }
    }
}
