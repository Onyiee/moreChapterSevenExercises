package exerciseSevenPointOneFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableLengthArgTest {
    VariableLengthArg variableLengthArg;

    @BeforeEach
    void setUp() {
        variableLengthArg = new VariableLengthArg();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void productCanBeCalculated() {
        assertEquals(8, variableLengthArg.product(2,1,4));
        assertEquals(72900,variableLengthArg.product(6,2,9,3,5,9,5));
        assertEquals(72576000,variableLengthArg.product(2,1,4,7,9,3,5,8,5,8,3,10));
    }
}