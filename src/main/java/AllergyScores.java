import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;

public class AllergyScores {
  public static String totalScore(int score) {

    String[] allergens = {"cats", "pollen", "chocolate", "tomatoes", "strawberries", "shellfish", "peanuts", "eggs"};
    // , "shellfish", "strawberries", "tomatoes", "chocolate", "pollen", "cats"
    Integer[] allergenScore = {128, 64, 32, 16, 8, 4, 2, 1};
    // , 2, 4, 8, 16, 32, 64, 128
    int currentScore = score;

    ArrayList<String> allergyListArray = new ArrayList<String>();
    for (int currentAllergen = 0; currentAllergen < allergens.length; currentAllergen++) {
      if (allergenScore[currentAllergen] <= currentScore) {
        allergyListArray.add(allergens[currentAllergen]);
        currentScore -= allergenScore[currentAllergen];
      }
    }

    String allergies = "";
    for (int index = 0; index < allergyListArray.size(); index++) {
      allergies = allergies.concat(allergyListArray.get(index));
      if (index != allergyListArray.size()-1) {
        allergies = allergies.concat(", ");
      }
    }
    return allergies;
  }
}
