package exerciseSevenPointOneSeven;

public class Main {
    public static void main(String[] args) {
        DiceRolling diceRolling = new DiceRolling();
        int dieRolled = 2;

        for (int i = 0; i < 36000000; i++) {
            diceRolling.rollBothDiceAndGetSum();
            diceRolling.arrayOfRolledDiceFrequency(diceRolling.getSumOfRolledDice());
        }
        System.out.printf("%s%15s%n","die Rolled","frequency");
        for (int frequency: diceRolling.getArrayOfSumOfRolledDiceResult()) {
            System.out.printf("%d%20d%n",dieRolled,frequency);
            dieRolled+=1;
        }
    }
}
