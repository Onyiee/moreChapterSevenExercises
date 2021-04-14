package exerciseSevenPointOneTwo;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DuplicateElimination duplicateElimination = new DuplicateElimination();
        int [] numbers = new int[5];

        Scanner input = new Scanner(System.in);

        for (int counter = 0; counter < numbers.length; counter++){
            int number= 0 ;
            System.out.println("Enter a number between 10 and 100: ");
             try {
                  number = input.nextInt();
             }catch (InputMismatchException e){
                 System.err.println("You need to enter an integer.");
                 input.next();
             }
            duplicateElimination.removeDuplicateNumbers(numbers,number);
        }

        try{
        duplicateElimination.setNumbersInArray(duplicateElimination.getArrayWithoutDuplicates());
            System.out.println(Arrays.toString(duplicateElimination.getNumbersInArray()));
    }catch (DuplicateEliminationException e){
            System.err.println(e.getMessage());
        }

    }
}
