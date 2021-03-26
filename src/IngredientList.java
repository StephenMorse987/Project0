import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A list of Ingredients organized in an ArrayList format and initialized with a pre-formatted list of Ingredients.
 */
public class IngredientList {
    private ArrayList<Ingredient> ingredientList;

    /**
     * Initializes a list of Ingredients from a given filename.
     * @param inputFileName
     * a String associated with a text file of listed ingredients.
     * @throws FileNotFoundException
     * When the given filename does not correspond with a file.
     */
    public IngredientList(String inputFileName) throws FileNotFoundException {
        //ingredientList is initialized here
        ingredientList = new ArrayList<Ingredient>();
        
        //The given file is opened through a scanner
        Scanner fileReader = new Scanner(new File(inputFileName));
        
        //Creates populates ingredientList with data from the file
        while (fileReader.hasNextLine()) {
            ingredientList.add(new Ingredient(fileReader.nextLine()));
        }

        //The file has been read; Close the scanner
        fileReader.close();
    }

    public void outputHashList() {
        System.out.println(ingredientList);
    }

    /**
     * Returns individual elements of the ingredientList
     * @param index
     * an Integer
     * @return
     * Ingredient at {@code index}
     */
    public Ingredient getElement(Integer index) {
        return ingredientList.get(index);
    }

    /**
     * Returns the number of Ingredients in the ingredientList
     * @return an Integer
     */
    public Integer listLength() {
        return ingredientList.size();
    }
}
