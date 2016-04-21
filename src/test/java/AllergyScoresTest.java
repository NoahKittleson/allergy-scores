import org.junit.*;
import static org.junit.Assert.*;

public class AllergyScoresTest {

  @Test
  public void FinalAllergies_OutputCatsTest() {
    AllergyScores newTotalScore = new AllergyScores();
    assertEquals("cats", newTotalScore.totalScore(128));
  }

  @Test
  public void FinalAllergies_OutputPollenTest() {
    AllergyScores newTotalScore = new AllergyScores();
    assertEquals("pollen", newTotalScore.totalScore(64));
  }

  @Test
  public void FinalAllergies_OutputChocolateTest() {
    AllergyScores newTotalScore = new AllergyScores();
    assertEquals("chocolate", newTotalScore.totalScore(32));
  }

  @Test
  public void FinalAllergies_OutputTomatoesTest() {
    AllergyScores newTotalScore = new AllergyScores();
    assertEquals("tomatoes", newTotalScore.totalScore(16));
  }

  @Test
  public void FinalAllergies_OutputStrawberriesTest() {
    AllergyScores newTotalScore = new AllergyScores();
    assertEquals("strawberries", newTotalScore.totalScore(8));
  }

  @Test
  public void FinalAllergies_OutputShellfishTest() {
    AllergyScores newTotalScore = new AllergyScores();
    assertEquals("shellfish", newTotalScore.totalScore(4));
  }

  @Test
  public void FinalAllergies_OutputPeanutsTest() {
    AllergyScores newTotalScore = new AllergyScores();
    assertEquals("peanuts", newTotalScore.totalScore(2));
  }

  @Test
  public void FinalAllergies_OutputEggsTest() {
    AllergyScores newTotalScore = new AllergyScores();
    assertEquals("eggs", newTotalScore.totalScore(1));
  }

  @Test
  public void FinalAllergies_OutputEverythingTest() {
    AllergyScores newTotalScore = new AllergyScores();
    assertEquals("cats, pollen, chocolate, tomatoes, strawberries, shellfish, peanuts, eggs", newTotalScore.totalScore(255));
  }

  @Test
  public void FinalAllergies_OutputChocolateToEggsTest() {
    AllergyScores newTotalScore = new AllergyScores();
    assertEquals("chocolate, tomatoes, strawberries, shellfish, peanuts, eggs", newTotalScore.totalScore(63));
  }
}
