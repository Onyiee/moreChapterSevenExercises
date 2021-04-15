package exerciseSevenPointOneSeven;
//7.17 (Dice Rolling) Write an application to simulate the rolling of two dice. The application
//        should use an object of class Random once to roll the first die and again to roll the second die. The
//        sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
//        the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
//        least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
//        should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
//        each possible sum appears. Display the results in tabular format.

public class DiceRolling {
    private Die die1 = new Die();
    private Die die2 = new Die();
    private  int sumOfRolledDiceResult;
    private  int[] arrayOfDiceResult = {};


    public void rollBothDice() {
        int die1Result = die1.roll();
        int die2Result = die2.roll();
          sumOfRolledDiceResult = die1Result + die2Result;
    }

    public int getSumOfRolledDice() {
        return sumOfRolledDiceResult;
    }

    public void ArrayOfSumOfRolledDiceResult(int sumOfRolledDiceResult) {
        for (int i = 0; i < arrayOfDiceResult.length; i++) {
            if (arrayOfDiceResult[i] == 0){
                arrayOfDiceResult[i] = sumOfRolledDiceResult;
                break;
            }
        }
    }

    public int[] getArrayOfSumOfRolledDiceResult() {
        return arrayOfDiceResult;
    }


}
