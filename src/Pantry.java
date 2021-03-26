import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pantry {
    private ArrayList<Ingredient> ingredientList;
    private ArrayList<Integer> locationList;
    private ArrayList<String> locations;

    /**
     * Spoofity spoofity foo
     * @param pantryFile
     * @param locationsFile
     * @throws FileNotFoundException
     */
    public Pantry (String pantryFile, String locationsFile) throws FileNotFoundException {
        ingredientList = new ArrayList<Ingredient>();
        locationList = new ArrayList<Integer>();
        locations = new ArrayList<String>();
        Scanner fileReader;

        try{
            fileReader = new Scanner(new File(locationsFile));
            while (fileReader.hasNextLine()) {
                locations.add(fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException ep) {
            //No File Found; Create New Blank File
        }

        fileReader = new Scanner(new File(pantryFile));
        while (fileReader.hasNextLine()) {
            String pantryLine[] = fileReader.nextLine().split(",",4);
            ingredientList.add(new Ingredient(pantryLine[0] + "," + pantryLine[1] + "," + pantryLine[2]));
            locationList.add(Integer.parseInt(pantryLine[3]));
        }
        fileReader.close();
    }
}
