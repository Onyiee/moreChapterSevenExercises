package exerciseSevenPointOneFour;
//7.14 (Variable-Length Argument List) Write an application that calculates the product of a series
//        of integers that are passed to method product using a variable-length argument list.
//        Test your method with several calls, each with a different number of arguments.


public class VariableLengthArg {

    public int product (int...  listOfIntegers){
        int productOfIntegers = 1;
        for (int integer:
             listOfIntegers) {
             productOfIntegers = productOfIntegers * integer;
        }
      return productOfIntegers;
    }
}
