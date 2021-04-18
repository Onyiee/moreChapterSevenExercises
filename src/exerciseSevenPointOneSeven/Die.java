package exerciseSevenPointOneSeven;

import java.util.Random;

public class Die {
    private final Random random = new Random();
    public int roll(){
        int roll = random.nextInt(6) + 1;
        return roll;

    }
}
