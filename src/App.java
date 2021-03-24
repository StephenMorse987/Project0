import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    private static String filename = "IngredientList.txt";
    public static void main(String[] args) {
        try {
            System.out.println("Opening Input File...");
            File inputFile = new File(filename);
            Scanner fileReader = new Scanner(inputFile);
            System.out.println("Reader Opened Successfully!");
            //Read File Contents
            while (fileReader.hasNextLine()) {
                String inputLine = fileReader.nextLine();
                System.out.println(inputLine);
            }
            fileReader.close();
            System.out.println("Reader Closed Successfully!");
        } catch (FileNotFoundException ep) {
            System.out.println("FileNotFoundException occurred:");
            ep.printStackTrace();
        }
    }
}
