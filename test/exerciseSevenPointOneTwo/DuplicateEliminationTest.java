package exerciseSevenPointOneTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {
    DuplicateElimination duplicateElimination;

    @BeforeEach
    void setUp() {
        duplicateElimination = new DuplicateElimination();
    }

    @AfterEach
    void tearDown() {
    }

    private int [] numbers = new int[5];



    @Test
    void numbersInArrayCanBeSetAndGotten() throws DuplicateEliminationException {
        numbers = new int[]{11, 25, 39, 60, 98};
        duplicateElimination.setNumbersInArray(numbers);
        assertEquals(numbers,
                duplicateElimination.getNumbersInArray());
        numbers = new int[]{11, 25, 39, 60, 500};
        assertThrows(DuplicateEliminationException.class,()->duplicateElimination.setNumbersInArray(numbers));

    }

    @Test
    void checkThatNewNumbersEnteredDoNotAlreadyExist(){
        numbers = new int[]{11, 25, 39, 0, 0};
        duplicateElimination.removeDuplicateNumbers(numbers, 78);
        duplicateElimination.removeDuplicateNumbers(numbers, 78);
        assertEquals(0, duplicateElimination.getArrayWithoutDuplicates()[4]);

    }

}