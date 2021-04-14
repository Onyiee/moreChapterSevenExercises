package exerciseSevenPointOneTwo;
//7.12 (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
//        Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
//        is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst
//        case,”
//        in which all five numbers are different. Use the smallest possible array to solve this problem.
//        Display
//        the complete set of unique values input after the user enters each new value.
//

public class DuplicateElimination {

    private int[] numbers;

    public void setNumbersInArray(int[] numbers) throws DuplicateEliminationException{
        for (int number : numbers) {
            if (number >= 10 && number <= 100) {
                this.numbers = numbers;
            }else {
                throw new DuplicateEliminationException("Invalid input. Enter a number between 10 and 100");
            }
        }

    }


    public int[] getNumbersInArray() {
        return numbers;
    }

    public void removeDuplicateNumbers(int[] numbers, int number) {
        for (int counter = 0; counter < numbers.length;  counter++) {
            if (number == numbers[counter]){
                break;
            }
            if (number != numbers[counter] && numbers[counter]== 0) {
                numbers[counter] = number;
              break;
            }

        }
        this.numbers=numbers;


    }

    public int[] getArrayWithoutDuplicates() {
        return numbers;
    }
}
