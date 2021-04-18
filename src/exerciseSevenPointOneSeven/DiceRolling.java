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
    private  int[] arrayOfDiceResult = new int[11];



    public void rollBothDiceAndGetSum() {
        int die1Result = die1.roll();
        int die2Result = die2.roll();
          sumOfRolledDiceResult = die1Result + die2Result;
    }

    public int getSumOfRolledDice() {
        return sumOfRolledDiceResult;
    }

    public void arrayOfRolledDiceFrequency(int sumOfRolledDiceResult) {
        switch (sumOfRolledDiceResult){
            case 2:
                 arrayOfDiceResult[0]++;
                 break;
            case 3:
                arrayOfDiceResult[1]++;
                break;
            case 4:
                arrayOfDiceResult[2]++;
                break;
            case 5:
                arrayOfDiceResult[3]++;
                break;
            case 6:
                arrayOfDiceResult[4]++;
                break;
            case 7:
                arrayOfDiceResult[5]++;
                break;
            case 8:
                arrayOfDiceResult[6]++;
                break;
            case 9:
                arrayOfDiceResult[7]++;
                break;
            case 10:
                arrayOfDiceResult[8]++;
                break;
            case 11:
                arrayOfDiceResult[9]++;
                break;
            case 12:
                arrayOfDiceResult[10]++;
        }
    }

    public int[] getArrayOfSumOfRolledDiceResult() {
        return arrayOfDiceResult;
    }


}
