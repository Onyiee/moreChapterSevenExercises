package exerciseSevenPointOneSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DiceRollingTest {
    DiceRolling diceRolling;
    int[] arrayOfDiceResult = {0};


    @BeforeEach
    void setUp() {
        diceRolling = new DiceRolling();
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void sumOfRolledDiceCanBeGotten(){
        diceRolling.rollBothDice();
       assertNotEquals(0, diceRolling.getSumOfRolledDice());
    }

    @Test
    void sumOfRolledDiceCanBeSavedInAnArray(){
        int [] newArray = {9};
        diceRolling.ArrayOfSumOfRolledDiceResult(9);
//        for (int i = 0; i < arrayOfDiceResult.length; i++) {
//            if (arrayOfDiceResult[i] == 0){
//                arrayOfDiceResult[i] = 9;
//            }
//        }
//        assertArrayEquals(newArray,diceRolling.getArrayOfSumOfRolledDiceResult());


    }
}