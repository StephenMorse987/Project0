import java.lang.String;

/**
 * An Ingredient, which contains an {@code amount:Float}, a {@code measure:String} for the amount, and a {@code name:String}.
 */
public class Ingredient {
    private float amount;
    private String measure;
    private String ingredientName;

    /**
     * Initializes an {@code Ingredient} from a pre-formatted String.
     * An ingredient has an {@code amount:Float}, the {@code measure:String} of the given amount, and an {@code ingredientName:String}.
     * @param inputLine must be a String in the format: {@code amount,"measure","name"}
     */
    public Ingredient (String inputLine) {
        String[] pieces = inputLine.split(",",3);

        this.amount = Float.parseFloat(pieces[0]);
        if (pieces[1].length() == 2) {
            this.measure = "count";
        } else {
            this.measure = pieces[1].replace("\"","");
        }
        this.ingredientName = pieces[2].replace("\"","");
    }

    /**
     * Returns the Ingredient's amount
     * @return a Float
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Returns the Ingredient's amount measure (i.e. "tbsp" or "lb")
     * @return a String
     */
    public String getMeasure() {
        return measure;
    }

    /**
     * Returns the Ingredient's name
     * @return a String
     */
    public String getName() {
        return ingredientName;
    }

    /**
     * Returns the original given format for an Ingredient.
     * @return a String in the format {@code amount,"measure","name"}
     */
    public String outputFormat() {
        return amount + ",\"" + measure + "\",\"" + ingredientName + "\"";
    }
}
